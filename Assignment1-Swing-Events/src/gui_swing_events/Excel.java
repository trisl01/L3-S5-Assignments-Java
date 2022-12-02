package gui_swing_events;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excel {
  // Declare the private class variable
  // This variable will be an empty "ArrayList" object of "Double" data type
  // To save/retrieve the user's input numbers in the textfield
  private ArrayList<Double> numbers;


  /* 
   * Declare the first constructor method:
   * Passing an argument/parameter of ArrayList<Double>
   * Notice that this constructor will not be in used in this assignment,
   * but it's good to have it in case we need to immediately pass ArrayList
   */
  public Excel() {
    // Just a simple assignment operator
    // Assign the passing parameter it to the class variable "numbers"
    this.numbers = new ArrayList<Double>();
  }


  /*
   * Declare the second constructor method (Overloading):
   * - passing an argument/parameter of String data type
   *
   * NOTE:
   * This passing string will represent the user's input (string of numbers)
   */
  public Excel(String string) {
    // NOTE: You can combine the three lines below into one:

    // Creating an array of String data type out of the string of numbers
    // using .split() method:
    // You can name it "strNumArray"
    String[] strNumArray = string.split(" ");

    // Creating a list view (List Interface) from the previous array
    // using .asList() method of the "Arrays" class
    // You can name it "strNumList"
    List<String> strNumList = (List<String>) Arrays.asList(strNumArray);

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
    }
  }


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
  public Double findTotal() {
    Double total = 0.0;
    for (Double number : this.numbers) {
      total += number;
    }
    return total;
  }


  // Define the second method "findAvg" to return the average
  public Double findAvg() {
    Double total = 0.0;
    int length = 0;
    for (Double number : this.numbers) {
      total += number;
      length++;
    }
    return total/length;
  }


  // Define the third method "findMax" to return the maximum number
  public Double findMax() {
    Double max = null;
    boolean isFirst = true;
    for (Double number : this.numbers) {
      if (isFirst) {
        max = number;
      } else if (number > max) {
        max = number;
      }
    }
    return max;
  }


  // Define the fourth method "findMin" to return the minimum number
  public Double findMin() {
    Double min = null;
    boolean isFirst = true;
    for (Double number : this.numbers) {
      if (isFirst) {
        min = number;
      } else if (number < min) {
        min = number;
      }
    }
    return min;
  }
}