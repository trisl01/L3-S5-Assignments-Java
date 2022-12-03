package gui_swing_events;

import colors.ColorText;

// the package statement
// the Class file that contains the main() method as the entry-point
// main() method for just establishing the "SwingEventWindow" class

public class Main {
  public static void main(String[] args) {
    System.out.println(ColorText.getBlueBold() + "> Start program" + ColorText.getReset());

    if (Excel.testExcel(true)) {
      System.out.println("> Start SwingEventWindow.java");
      new SwingEventWindow();
      System.out.println("> End SwingEventWindow.java");
    } else {
      System.out.println(ColorText.getRedBold() + "Error on Excel.java" + ColorText.getReset());
    }

    System.out.println(ColorText.getBlueBold() + "> End program" + ColorText.getReset());
  }
}
