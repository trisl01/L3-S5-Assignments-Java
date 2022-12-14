package gui_swing_events;

import javax.swing.*;
import java.awt.event.*;

public class SwingEventWindow extends JFrame implements ActionListener, ItemListener {
  // Declare the checked radio button variable flag:
  // this global and private variable is set to an initial value of 1
  // which refer to the first radio button to be selected by default
  // You can name "rdoChecked"
  private int rdoChecked = 1;

  // Create JPanel main container object:
  private JPanel mainPanel = new JPanel();

  // You create JPanel sub containers objects for each section of the GUI:
  private JPanel pnl1 = new JPanel();
  private JPanel pnl2 = new JPanel();
  private JPanel pnl3 = new JPanel();
  private JPanel pnl4 = new JPanel();
  private JPanel pnl5 = new JPanel();
  private JPanel pnl6 = new JPanel();

  // Create JComponents Items based on the assignment requirements:
  private JLabel lblMain = new JLabel("Excel Functions");
  private JLabel lblRequest = new JLabel("Enter your numbers separated by spaces");
  private JLabel lblResult = new JLabel("Result: ");

  private JTextField txtInput = new JTextField(30);
  private JTextField txtOutput = new JTextField(20);

  private JButton btn = new JButton("Calculate");

  // Create/Declare the 4 radio buttons objects:
  private JRadioButton rdo1 = new JRadioButton("AutoSum", true);
  private JRadioButton rdo2 = new JRadioButton("Average");
  private JRadioButton rdo3 = new JRadioButton("Maximum");
  private JRadioButton rdo4 = new JRadioButton("Minimum");

  // Using ButtonGroup class for grouping the 4 related radio buttons
  // Create/Declare the ButtonGroup object
  // for grouping the radio button inside the constructor method
  private ButtonGroup btnGroup = new ButtonGroup();

  // Class Constructor:
  public SwingEventWindow() {    
    // Setting Windows Title by targeting the method from the super class:
    super("Excel Formulas Window");

    // Setting Window (JFrame) Size:
    setSize(370, 270);

    // Set the Window (JFrame) visibility to true to make it visible
    setVisible(true);

    // Setting the default operation for the close button to Exit the JFrame
    // (Stopping the application)
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // No need to assign/set any value to the JComponents
    // It's already done when they are all declared above

    // Just group the four related JRadioButton components:
    // by adding them to the ButtonGroup object that you declared earlier
    btnGroup.add(rdo1);
    btnGroup.add(rdo2);
    btnGroup.add(rdo3);
    btnGroup.add(rdo4);

    // Adding the components to their panels:
    /*
     * IMPORTANT Note:
     * For quick demo, I used different and multiple JPanels objects
     * to layout the GUI components.
     * It's better to use the "GridLayout" based on the instructions
     */
    // Panel#1 for lblMain - Panel#2 for lblRequest - Panel#3 for txtNum
    pnl1.add(lblMain);
    pnl2.add(lblRequest);
    pnl3.add(txtInput);

    // Panel#4 for the 4 radio buttons
    pnl4.add(rdo1);
    pnl4.add(rdo2);
    pnl4.add(rdo3);
    pnl4.add(rdo4);

    // Panel#5 for the calculate button
    pnl5.add(btn);

    // Panel#6 for the result label and the result output textfield
    pnl6.add(lblResult);
    pnl6.add(txtOutput);

    // Adding all the 6 sub panels to the main panel (the main container):
    mainPanel.add(pnl1);
    mainPanel.add(pnl2);
    mainPanel.add(pnl3);
    mainPanel.add(pnl4);
    mainPanel.add(pnl5);
    mainPanel.add(pnl6);

    // Adding the main panel "mainPanel" (JPanel object) to the JFrame:
    add(mainPanel);

    // Adding/attaching the required Events to some components:
    /*
     * We need to add the required events to each radio button
     * and to the submit "Calculate" button only
     */
    rdo1.addItemListener(this);
    rdo2.addItemListener(this);
    rdo3.addItemListener(this);
    rdo4.addItemListener(this);
    btn.addActionListener(this);

    setVisible(true);
  }


  // Implementing the two required methods (event-handler)
  // for each interface:
  @Override
  public void itemStateChanged(ItemEvent e) {
    if (!((e.getItemSelectable() == rdo1 && rdoChecked == 1) || (e.getItemSelectable() == rdo2 && rdoChecked == 2) || (e.getItemSelectable() == rdo3 && rdoChecked == 3) || (e.getItemSelectable() == rdo4 && rdoChecked == 4))) {
      System.out.print(" > Radio selected: ");
      if (e.getItemSelectable() == rdo1) {
        // set the value of the flag variable "rdoChecked" to 1
        rdoChecked = 1;
        System.out.println("AutoSum");
      } else if (e.getItemSelectable() == rdo2) {
        // set the value of the flag variable "rdoChecked" to 2
        rdoChecked = 2;
        System.out.println("Average");
      } else if (e.getItemSelectable() == rdo3) {
        // set the value of the flag variable "rdoChecked" to 3
        rdoChecked = 3;
        System.out.println("Maximum");
      } else {
        // set the value of the flag variable "rdoChecked" to 4
        rdoChecked = 4;
        System.out.println("Minimum");
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // Getting the user's input string from the first textfield:
    // Save it into a variable of String data type:
    String inputStr = txtInput.getText();
    System.out.print(" > Calculate: Input = \"" + inputStr + "\"");

    // Initialize our "Excel" class object:
    /*
     * Passing the String value of the user's input to the constructor
     * Java will pick the second constructor from the Excel class
     * based on the passing data type of the argument which is "String"
     */
    Excel excelUser = new Excel(inputStr);
    System.out.print(" - " + excelUser.toString());

    // Run the if condition for checking the value of the flag variable "rdoChecked"
    if (rdoChecked == 1) {
      // call the findTotal() method
      Double findTotal = excelUser.findTotal();
      System.out.println(" - findTotal() = " + findTotal);

      // output/Print the result (value) in the result's textfield
      if (findTotal != null) {
        txtOutput.setText(findTotal.toString());
      } else {
        txtOutput.setText("NaN");
      }
    } else if (rdoChecked == 2) {
      // call the findAvg() method
      Double findAvg = excelUser.findAvg();
      System.out.println(" - findAvg() = " + findAvg);

      // output/Print the result (value) in the result's textfield
      if (findAvg != null) {
        txtOutput.setText(findAvg.toString());
      } else {
        txtOutput.setText("NaN");
      }
    } else if (rdoChecked == 3) {
      // call the findMax() method
      Double findMax = excelUser.findMax();
      System.out.println(" - findMax() = " + findMax);

      // output/Print the result (value) in the result's textfield
      if (findMax != null) {
        txtOutput.setText(findMax.toString());
      } else {
        txtOutput.setText("NaN");
      }
    } else if (rdoChecked == 4) {
      // call the findMin() method
      Double findMin = excelUser.findMin();
      System.out.println(" - findMin() = " + findMin);

      // output/Print the result (value) in the result's textfield
      if (findMin != null) {
        txtOutput.setText(findMin.toString());
      } else {
        txtOutput.setText("NaN");
      }
    }
  }
}