/*
 * Represents a cello that can be sold at a store
 * Cello is a type of Instrument
 */
public class Cello extends Instrument {

  private double bowLength;     //Length of the cello bow in inches

  /*
   * No-argument constructor
   */
  public Cello() {
    super("brown", "full size", true);
    bowLength = 28.0;
  }

  /*
   * Parameterized constructor with parameters for all instance variables
   */
  public Cello(String color, String size, boolean hasStrings, double bowLength) {
    super(color, size, hasStrings);
    this.bowLength = bowLength;
  }

  /*
   * Parameterized constructor with parameters for color, size, and bowLength instance variables
   */
  public Cello(String color, String size, double bowLength) {
    super(color, size);
    this.bowLength = bowLength;
  }
  
  /*
   * Accessor method for the bowLength instance variable
   */
  public double getBowLength() {
    return bowLength;
  }

  /*
   * Mutator method for the bowLength instance variable
   */
  public void setBowLength(double bowLength) {
    this.bowLength = bowLength;
  }

  /*
   * Override for toString() method
   */
  public String toString() {
    //Displays attributes and whether the cello is playable or not
    if(super.getHasStrings() == false) {
      return super.toString() + "\nBow Length: " + bowLength + " inches" + "\nNot playable because it has no strings.";
    } else {
      return super.toString() + "\nBow Length: " + bowLength + " inches" + "\nStart playing!";
    }
  }
}