import java.util.Scanner;
/**
 * This program will read in 5 card values into an array and determine what the count would be
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // import a scanner for user input
    Scanner input = new Scanner(System.in);

    // create an array with 5 indexes
    int[] cardValues = new int[5];

    // ask the user to enter in 5 card values
    System.out.println("Please enter the value of 5 cards:");

    // create a for loop to input 5 card values
    for(int i = 0; i < 5; i++){
      cardValues[i] = input.nextInt();
    }

    // determine the count of the cards using if statements
    if(cardValues[0] < 7){
      cardValues[0] = 1;
    } else if(cardValues[0] >= 7 && cardValues[0] < 10){
      cardValues[0] = 0;
    } else{
      cardValues[0] = -1;
    } if(cardValues[1] < 7){       
       cardValues[1] = 1;
    } else if(cardValues[1] >= 7 && cardValues[1] < 10){
      cardValues[1] = 0;
    } else{
      cardValues[1] = -1;
    } if(cardValues[2] < 7){
      cardValues[2] = 1;
    } else if(cardValues[2] >= 7 && cardValues[2] < 10){
      cardValues[2] = 0;
    } else{
      cardValues[2] = -1;
     } if(cardValues[3] < 7){
      cardValues[3] = 1;
     } else if(cardValues[3] >= 7 && cardValues[3] < 10){
      cardValues[3] = 0;
    } else{
      cardValues[3] = -1;
     } if(cardValues[4] < 7){
      cardValues[4] = 1;
     } else if(cardValues[4] >= 7 && cardValues[4] < 10){
      cardValues[4] = 0;
     } else{
      cardValues[4] = -1;
      }
    
    // create a total variable to determine the count
    int total = cardValues[0] + cardValues[1] + cardValues[2] + cardValues[3] + cardValues[4];
    
    // let the user know what the count is  
      System.out.println("The count would be " + total);
     
  
  }
}
