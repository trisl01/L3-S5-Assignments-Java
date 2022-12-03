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
    // Adding the main panel "mainPanel" (JPanel object) to the JFrame:

    // Adding/attaching the required Events to some components:
    /*
     * We need to add the required events to each radio button
     * and to the submit "Calculate" button only
     */
  } // end constructor

  // Implementing the two required methods (event-handler)
  // for each interface:
  @Override
  public void Event-Handler method for the radio buttons {
    if (first radio button for total is selected) then:
      // set the value of the flag variable "rdoChecked" to 1
    else if (second radio button for average is selected) then:
      // set the value of the flag variable "rdoChecked" to 2
    else if (third radio button for max is selected) then:
      // set the value of the flag variable "rdoChecked" to 3
    else then:
      // set the value of the flag variable "rdoChecked" to 4
  }

  @Override
  public void Event-Handler method for the calculate button {
    // Getting the user's input string from the first textfield:
    // Save it into a variable of String data type:

    // Initialize our "Excel" class object:
    /*
     * Passing the String value of the user's input to the constructor
     * Java will pick the second constructor from the Excel class
     * based on the passing data type of the argument which is "String"
     */

    // Run the if condition for checking the value of the flag variable "rdoChecked"
    if (rdoChecked == 1) {
      // call the findTotal() method
      // output/Print the result (value) in the result's textfield
    } else if (rdoChecked == 2) {
      // call the findAvg() method
      // output/Print the result (value) in the result's textfield
    } else if (rdoChecked == 3) {
      // call the findMax() method
      // output/Print the result (value) in the result's textfield
    } else if (rdoChecked == 4) {
      // call the findMin() method
      // output/Print the result (value) in the result's textfield
    }
  }
}