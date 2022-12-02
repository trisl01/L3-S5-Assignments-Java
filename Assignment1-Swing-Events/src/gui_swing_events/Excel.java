package gui_swing_events;

public class Excel {
  // Declare the private class variable
  // This variable will be an empty "ArrayList" object of "Double" data type
  // To save/retrieve the user's input numbers in the textfield

  /* 
   * Declare the first constructor method:
   * Passing an argument/parameter of ArrayList<Double>
   * Notice that this constructor will not be in used in this assignment,
   * but it's good to have it in case we need to immediately pass ArrayList
   */
  public Constructor1 {
    // Just a simple assignment operator
    // Assign the passing parameter it to the class variable "numbers"
  } // end Constructor1

  /*
   * Declare the second constructor method (Overloading):
   * - passing an argument/parameter of String data type
   *
   * NOTE:
   * This passing string will represent the user's input (string of numbers)
   */
  public Constructor2 {
    // NOTE: You can combine the three lines below into one:

    // Creating an array of String data type out of the string of numbers
    // using .split() method:
    // You can name it "strNumArray"
    strNumArray = ...

    // Creating a list view (List Interface) from the previous array
    // using .asList() method of the "Arrays" class
    // You can name it "strNumList"
    strNumList = ...

    // Creating an ArrayList object ("ArrayList" Class) from the previous List:
    // You can name it "strNumArrayList"
    strNumArrayList = ...

    // Finally, using forEach to loop through the previous "ArrayList" object
    // 1. Converting each item of String Data type to "Double"
    // 2. Adding the value to the "ArrayList" object "numbers"
    // NOTE: Using double so it can handle both whole numbers and fractions
    strNumArrayList.forEach(...);

    // for testing (optional) 😊
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    } // end for loop
  } // end Constructor2

  /*
   * Start declaring the 4 individual methods:
   * - findTotal() method
   * - findAvg() method
   * - findMax() method
   * - findMin() method
   *
   * NOTES:
   * - All the method should be publicly accessed
   * - All the method should return a double data type (for sure) :-)
   * - No need to pass any argument as you can call the ArrayList "numbers"
   * do your calculation on it
   */

  // Define the first method "findTotal" to return the total
  // Define the second method "findAvg" to return the average
  // Define the third method "findMax" to return the maximum number
  // Define the fourth method "findMin" to return the minimum number
}