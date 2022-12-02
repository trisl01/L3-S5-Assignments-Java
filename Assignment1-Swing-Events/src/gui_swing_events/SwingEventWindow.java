package gui_swing_events;

public class SwingEventWindow [ext. the GUI class, imp. 2 Interfaces] {
  // Declare the checked radio button variable flag:
  // this global and private variable is set to an initial value of 1
  // which refer to the first radio button to be selected by default
  // You can name "rdoChecked"
  // Create JPanel main container object:
  // You create JPanel sub containers objects for each section of the GUI:
  // Create JComponents Items based on the assignment requirements:
  // Create/Declare the 4 radio buttons objects:

  // Using ButtonGroup class for grouping the 4 related radio buttons
  // Create/Declare the ButtonGroup object
  // for grouping the radio button inside the constructor method

  // Class Constructor:
  public Constructor() {
    // Setting Windows Title by targeting the method from the super class:
    // Setting Window (JFrame) Size:
    // Set the Window (JFrame) visibility to true to make it visible

    // Setting the default operation for the close button to Exit the JFrame
    // (Stopping the application)

    // No need to assign/set any value to the JComponents
    // It's already done when they are all declared above

    // Just group the four related JRadioButton components:
    // by adding them to the ButtonGroup object that you declared earlier

    // Adding the components to their panels:
    /*
     * IMPORTANT Note:
     * For quick demo, I used different and multiple JPanels objects
     * to layout the GUI components.
     * It's better to use the "GridLayout" based on the instructions
     */
    // Panel#1 for lblMain - Panel#2 for lblRequest - Panel#3 for txtNum
    // Panel#4 for the 4 radio buttons
    // Panel#5 for the calculate button
    // Panel#6 for the result label and the result output textfield

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
    if (rdoChecked equals 1) then:
      // call the findTotal() method
      // output/Print the result (value) in the result's textfield
    else if (rdoChecked equals 2) then:
      // call the findAvg() method
      // output/Print the result (value) in the result's textfield
    else if (rdoChecked equals 3) then:
      // call the findMax() method
      // output/Print the result (value) in the result's textfield
    else if (rdoChecked equals 4) then:
      // call the findMin() method
      // output/Print the result (value) in the result's textfield
  } // end Event-Handler method for the calculate button 
}