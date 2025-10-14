/*
 * Represents a piano that can be sold at a store
 * Piano is a type of Instrument
 */
public class Piano extends Instrument {

  private boolean isKeyboard;     //Whether or not it is a keyboard

  /*
   * No-argument constructor
   */
  public Piano() {
    super("black", "unknown", true);
    isKeyboard = false;
  }

  /*
   * Parameterized constructor
   */
  public Piano(String color, String size, boolean hasStrings, boolean isKeyboard) {
    super(color, size, hasStrings);
    this.isKeyboard = isKeyboard;
    }

  /*
   * Accessor method for the isKeyboard instance variable
   */
  public boolean getIsKeyboard() {
    return isKeyboard;
  }

  /*
   * Mutator method for the isKeyboard instance variable
   */
  public void setIsKeyboard(boolean isKeyboard) {
    this.isKeyboard = isKeyboard;
  }

  /*
   * Override for toString() method
   */
  public String toString() {
    //Displays attributes and if it is a valid keyboard
    if(((isKeyboard == true) && (getHasStrings() == true)) || ((isKeyboard == false) && (getHasStrings() == false))) {
      return "Not a keyboard or piano.";
    } else {
      return super.toString() + "\nIs it a keyboard? " + isKeyboard + "\nStart playing!";
    }
  }
}