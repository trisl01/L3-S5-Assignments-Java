package colors;

public class ColorText {
  // Fichier pour avoir des couleurs, gras et souligné du texte dans la console.
  // Notamment pour l'affichage d'erreurs.

  // Reset
  private static final String RESET = "\u001B[0m";

  public static String getReset() {
    return RESET;
  }

  // Gras et Souligne
  private static final String BOLD = "\u001B[0;1m";
  private static final String UNDERLINE = "\u001B[4m";

  public static String getBold() {
    return BOLD;
  }
  public static String getUnderline() {
    return UNDERLINE;
  }

  // Rouge
  private static final String RED = "\u001B[31m";
  private static final String RED_BOLD = "\u001B[31;1m";

  public static String getRed() {
    return RED;
  }
  public static String getRedBold() {
    return RED_BOLD;
  }

  // Vert
  private static final String GREEN = "\u001B[32m";
  private static final String GREEN_BOLD = "\u001B[32;1m";

  public static String getGreen() {
    return GREEN;
  }
  public static String getGreenBold() {
    return GREEN_BOLD;
  }

  // Jaune
  private static final String YELLOW = "\u001B[33m";
  private static final String YELLOW_BOLD = "\u001B[33;1m";

  public static String getYellow() {
    return YELLOW;
  }
  public static String getYellowBold() {
    return YELLOW_BOLD;
  }

  // Bleu
  private static final String BLUE = "\u001B[34m";
  private static final String BLUE_BOLD = "\u001B[34;1m";

  public static String getBlue() {
    return BLUE;
  }
  public static String getBlueBold() {
    return BLUE_BOLD;
  }

  // Violet
  private static final String PURPLE = "\u001B[35m";
  private static final String PURPLE_BOLD = "\u001B[35m";

  public static String getPurple() {
    return PURPLE;
  }
  public static String getPurpleBold() {
    return PURPLE_BOLD;
  }

  // Cyan
  private static final String CYAN = "\u001B[36m";
  private static final String CYAN_BOLD = "\u001B[36m";

  public static String getCyan() {
    return CYAN;
  }
  public static String getCyanBold() {
    return CYAN_BOLD;
  }

  // Gris
  private static final String GREY = "\u001B[37m";
  private static final String GREY_BOLD = "\u001B[37m";

  public static String getGrey() {
    return GREY;
  }
  public static String getGreyBold() {
    return GREY_BOLD;
  }
}
