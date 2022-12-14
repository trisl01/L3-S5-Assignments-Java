package gui_swing_events;

import colors.ColorText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excel {
  // Declare the private class variable
  // This variable will be an empty "ArrayList" object of "Double" data type
  // To save/retrieve the user's input numbers in the textfield
  private ArrayList<Double> numbers = new ArrayList<Double>();


  /* 
   * Declare the first constructor method:
   * Passing an argument/parameter of ArrayList<Double>
   * Notice that this constructor will not be in used in this assignment,
   * but it's good to have it in case we need to immediately pass ArrayList
   */
  public Excel(ArrayList<Double> arrayNumbers) {
    // Just a simple assignment operator
    // Assign the passing parameter it to the class variable "numbers"
    this.numbers = arrayNumbers;
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
      try {
        Double temp = Double.parseDouble(str);
        this.numbers.add(Double.parseDouble(str));
      } catch (NumberFormatException e) {}
    }

    // for testing (optional) ????
    /*for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }*/
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
    if (this.numbers.isEmpty()) return null;
    Double total = 0.0;
    for (Double number : this.numbers) {
      total += number;
    }
    return total;
  }


  // Define the second method "findAvg" to return the average
  public Double findAvg() {
    if (this.numbers.isEmpty()) return null;
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
    if (this.numbers.isEmpty()) return null;
    Double max = null;
    boolean isFirst = true;
    for (Double number : this.numbers) {
      if (isFirst) {
        max = number;
        isFirst = false;
      } else if (number > max) {
        max = number;
      }
    }
    return max;
  }


  // Define the fourth method "findMin" to return the minimum number
  public Double findMin() {
    if (this.numbers.isEmpty()) return null;
    Double min = null;
    boolean isFirst = true;
    for (Double number : this.numbers) {
      if (isFirst) {
        min = number;
        isFirst = false;
      } else if (number < min) {
        min = number;
      }
    }
    return min;
  }


  @Override
  public String toString() {
    String str = "[";
    if (!this.numbers.isEmpty()) {
      boolean isFirst = true;
      for (Double number : this.numbers) {
        if (!isFirst) str += ", ";
        else isFirst = false;
        str += number;
      }
    } else {
      str += "empty";
    }
    str += "]";
    return str;
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

    String test3Str = "-11 365 23.3";
    ArrayList<Double> test3Array = new ArrayList<Double>();
    test3Array.add(Double.parseDouble("-11"));
    test3Array.add(Double.parseDouble("365"));
    test3Array.add(Double.parseDouble("23.3"));
    Double test3Total = 377.3;
    Double test3Avg = test3Total/3;
    Double test3Max = 365.0;
    Double test3Min = -11.0;

    String test4Str = "1 2 3  a";
    ArrayList<Double> test4Array = new ArrayList<Double>();
    test4Array.add(Double.parseDouble("1"));
    test4Array.add(Double.parseDouble("2"));
    test4Array.add(Double.parseDouble("3"));
    Double test4Total = 6.0;
    Double test4Avg = test4Total/3;
    Double test4Max = 3.0;
    Double test4Min = 1.0;

    String test5Str = " a dd";
    ArrayList<Double> test5Array = new ArrayList<Double>();
    Double test5Total = null;
    Double test5Avg = null;
    Double test5Max = null;
    Double test5Min = null;

    boolean tests[] = new boolean[5];
    boolean resultTest = true;

    //? Test constructor
    tests[0] = testConstructor(test1Str, test1Array);
    tests[1] = testConstructor(test2Str, test2Array);
    tests[2] = testConstructor(test3Str, test3Array);
    tests[3] = testConstructor(test4Str, test4Array);
    tests[4] = testConstructor(test5Str, test5Array);

    for (boolean b : tests) {
      if (!b) resultTest = false;
    }
    if (display) {
      displayResultsTest("constructor()", tests);
    } else if (!resultTest) {
      return false;
    }

    //? Test findTotal
    tests[0] = testFindTotal(test1Str, test1Total);
    tests[1] = testFindTotal(test2Str, test2Total);
    tests[2] = testFindTotal(test3Str, test3Total);
    tests[3] = testFindTotal(test4Str, test4Total);
    tests[4] = testFindTotal(test5Str, test5Total);

    for (boolean b : tests) {
      if (!b) resultTest = false;
    }
    if (display) {
      displayResultsTest("findTotal()", tests);
    } else if (!resultTest) {
      return false;
    }

    //? Test findAvg
    tests[0] = testFindAvg(test1Str, test1Avg);
    tests[1] = testFindAvg(test2Str, test2Avg);
    tests[2] = testFindAvg(test3Str, test3Avg);
    tests[3] = testFindAvg(test4Str, test4Avg);
    tests[4] = testFindAvg(test5Str, test5Avg);

    for (boolean b : tests) {
      if (!b) resultTest = false;
    }
    if (display) {
      displayResultsTest("findAvg()", tests);
    } else if (!resultTest) {
      return false;
    }

    //? Test findMax
    tests[0] = testFindMax(test1Str, test1Max);
    tests[1] = testFindMax(test2Str, test2Max);
    tests[2] = testFindMax(test3Str, test3Max);
    tests[3] = testFindMax(test4Str, test4Max);
    tests[4] = testFindMax(test5Str, test5Max);

    for (boolean b : tests) {
      if (!b) resultTest = false;
    }
    if (display) {
      displayResultsTest("findMax()", tests);
    } else if (!resultTest) {
      return false;
    }

    //? Test findMin
    tests[0] = testFindMin(test1Str, test1Min);
    tests[1] = testFindMin(test2Str, test2Min);
    tests[2] = testFindMin(test3Str, test3Min);
    tests[3] = testFindMin(test4Str, test4Min);
    tests[4] = testFindMin(test5Str, test5Min);

    for (boolean b : tests) {
      if (!b) resultTest = false;
    }
    if (display) {
      displayResultsTest("findMin()", tests);
    } else if (!resultTest) {
      return false;
    }
    
    if (display) System.out.println("> End Test Excel.java");
    return resultTest;
  }

  private static void displayResultsTest(String name, boolean tests[]) {
    System.out.print("  > Test "+name+": ");
    int countFalse = 0;
    for (boolean b : tests) {
      if (!b) countFalse++;
    }
    if (countFalse == 0) System.out.println(ColorText.getGreenBold() + "Success" + ColorText.getReset());
    else {
      System.out.print(ColorText.getRedBold() + "Fail" + ColorText.getReset() + " (" + ColorText.getRedBold() + countFalse + " fail");
      if (countFalse > 1) System.out.print("s");
      System.out.print(ColorText.getReset() + " / " + tests.length + " test");
      if (tests.length > 1) System.out.print("s");
      System.out.println(")");
    }
  }

  private static boolean testConstructor(String inputStr, ArrayList<Double> result) {
    Excel test = new Excel(inputStr);
    if (test.numbers.equals(result)) {
      return true;
    } else {
      return false;
    }
  }

  private static boolean testFindTotal(String inputStr, Double result) {
    Excel test = new Excel(inputStr);
    Double total = test.findTotal();
    if (total == result) { // for the 'null'
      return true;
    } else if (total.equals(result)) { // to compare the values
      return true;
    } else {
      return false;
    }
  }

  private static boolean testFindAvg(String inputStr, Double result) {
    Excel test = new Excel(inputStr);
    Double avg = test.findAvg();
    if (avg == result) { // for the 'null'
      return true;
    } else if (avg.equals(result)) { // to compare the values
      return true;
    } else {
      return false;
    }
  }

  private static boolean testFindMax(String inputStr, Double result) {
    Excel test = new Excel(inputStr);
    Double max = test.findMax();
    if (max == result) { // for the 'null'
      return true;
    } else if (max.equals(result)) { // to compare the values
      return true;
    } else {
      return false;
    }
  }

  private static boolean testFindMin(String inputStr, Double result) {
    Excel test = new Excel(inputStr);
    Double min = test.findMin();
    if (min == result) { // for the 'null'
      return true;
    } else if (min.equals(result)) { // to compare the values
      return true;
    } else {
      return false;
    }
  }
}