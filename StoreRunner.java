import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
    
    // Creates a Scanner object
    Scanner input = new Scanner(System.in);

    //Uses user input to create and display the attributes of an instrument/piano/cello
    MusicStore natesStore = new MusicStore();
    
    natesStore.purchaseInstrument(input);
    
    // Closes the Scanner object
    input.close();
  }
}