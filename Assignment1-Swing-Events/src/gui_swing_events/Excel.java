package gui_swing_events;

import colors.ColorText;
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
    ArrayList<String> strNumArrayList = new ArrayList<String>(strNumList);

    // Finally, using forEach to loop through the previous "ArrayList" object
    // 1. Converting each item of String Data type to "Double"
    // 2. Adding the value to the "ArrayList" object "numbers"
    // NOTE: Using double so it can handle both whole numbers and fractions
    for (String str : strNumArrayList) {
      this.numbers.add(Double.parseDouble(str));
    }

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


  //? Testing the code
  public static boolean testExcel(boolean display) {
    if (display) System.out.println("> Start Test Excel.java");
    String test1Str = "1 2 3 4 5 6 7 8 9";
    ArrayList<Double> test1Array = new ArrayList<Double>();
    test1Array.add(Double.parseDouble("1"));
    test1Array.add(Double.parseDouble("2"));
    test1Array.add(Double.parseDouble("3"));
    test1Array.add(Double.parseDouble("4"));
    test1Array.add(Double.parseDouble("5"));
    test1Array.add(Double.parseDouble("6"));
    test1Array.add(Double.parseDouble("7"));
    test1Array.add(Double.parseDouble("8"));
    test1Array.add(Double.parseDouble("9"));
    Double test1Total = 45.0;
    Double test1Avg = test1Total/9;
    Double test1Max = 9.0;
    Double test1Min = 1.0;

    String test2Str = "24   22 24.1 233";
    ArrayList<Double> test2Array = new ArrayList<Double>();
    test2Array.add(Double.parseDouble("24"));
    test2Array.add(Double.parseDouble("22"));
    test2Array.add(Double.parseDouble("24.1"));
    test2Array.add(Double.parseDouble("233"));
    Double test2Total = 303.1;
    Double test2Avg = test2Total/4;
    Double test2Max = 233.0;
    Double test2Min = 22.0;
    boolean resultTest = true;
    if (display) System.out.println("> End Test Excel.java");
    return resultTest;
  }
}