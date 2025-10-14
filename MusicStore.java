import java.util.Scanner;

/*
 * Uses user input to create and display Instrument/Cello/Piano objects and their attributes.
 */
public class MusicStore {

  /*
   * Uses the Scanner object to take user input to create and display Instrument/Cello/Piano
   * objects and their attributes.
   */
  public void purchaseInstrument(Scanner input) {
    System.out.print("What type of instrument would you like to purchase? ");
    String instrument = input.nextLine();

    //If the user enters the String "Cello", the program asks for the Cello class instance variables
    if(instrument.equalsIgnoreCase("Cello")) {
      System.out.print("What color would you like? ");
      String color = input.nextLine();
      System.out.print("What size would you like? ");
      String size = input.nextLine();
      System.out.print("Will it have strings to start? (true/false) ");
      boolean hasStrings = input.nextBoolean();
      System.out.print("What is the length of the bow that you want? ");
      double bowLength = input.nextDouble();

      //Creates the Cello object based on the user input
      Cello c = new Cello(color, size, hasStrings, bowLength);
      System.out.println("\nCello created!");
      System.out.println("\nYour Cello:\n"+ c);

    //If the user enters the String "Piano", the program asks for the Piano class instance variables
    } else if(instrument.equalsIgnoreCase("Piano")) {
      System.out.print("What color would you like? ");
      String color = input.nextLine();
      System.out.print("What size would you like? ");
      String size = input.nextLine();
      System.out.print("Do you want a keyboard? (true/false) ");
      boolean isKeyboard = input.nextBoolean();
      boolean hasStrings = true;

      //Sets the hasStrings instance variable to false if isKeyboard = true
      if(isKeyboard == true) {
        hasStrings = false;
      }

      //Creates the Piano object based on the user input
      Piano p = new Piano(color, size, hasStrings, isKeyboard);
      System.out.println("\nPiano created!");
      System.out.println("\nYour Piano\n" + p);

    //If the user enters anything else, the program asks for the Instrument class instance variables
    } else {
      System.out.print("What color would you like? ");
      String color = input.nextLine();
      System.out.print("What size would you like? ");
      String size = input.nextLine();
      System.out.print("Does it have strings? (true/false) ");
      boolean hasStrings = input.nextBoolean();

      //Creates the Instrument object based on the user input
      Instrument i = new Instrument(color, size, hasStrings);
      System.out.println("\nInstrument created!");
      System.out.println("\nYour Instrument:\n" + i);
    }
  }
}