/*
 * Represents an instrument that can be sold at a store
 */
public class Instrument {

  private String color;           //Color of the instrument
  private String size;            //Size of the instrument
  private boolean hasStrings;     //Whether or not it has strings

  /*
   * No-argument constructor
   */
  public Instrument() {
    this("unknown", "medium", false);
  }

  /*
   * Parameterized constructor with parameters for all instance variables
   */
  public Instrument(String color, String size, boolean hasStrings) {
    this.color = color;
    this.size = size;
    this.hasStrings = hasStrings;
  }

  /*
   * Parameterized constructor with parameters for color and size instance variables
   */
  public Instrument(String color, String size) {
    this.color = color;
    this.size = size;
  }

  /*
   * Accessor method for the color instance variable
   */
  public String getColor() {
    return color;
  }

  /*
   * Accessor method for the size instance variable
   */
  public String getSize() {
    return size;
  }

  /*
   * Accessor method for the hasStrings instance variable
   */
  public boolean getHasStrings() {
    return hasStrings;
  }

  /*
   * Mutator method for the color instance variable
   */
  public void setColor(String color) {
    this.color = color;
  }

  /*
   * Mutator method for the size instance variable
   */
  public void setSize(String size) {
    this.size = size;
  }

  /*
   * Mutator method for the hasStrings instance variable
   */
  public void setHasStrings(boolean hasStrings) {
    this.hasStrings = hasStrings;
  }

  /*
   * Override for toString() method
   */
  public String toString() {
    //Displays attributes, each on different lines
    return "Color: " + color + "\nSize: " + size + "\nHas Strings? " + hasStrings;
  }
}