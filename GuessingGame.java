import java.util.Scanner;

public class GuessingGame {
        
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String adminItemInput = "";
        int maxCount = 0;
        GuessingGame guessingGame = new GuessingGame();        

        System.out.printf("ADMINISTRATOR SETUP%n");
        System.out.printf("=======================%n");  
        System.out.printf("Name of items in the Jar:  ");
          adminItemInput = input.nextLine();
        System.out.print("Enter the maximum amount of " + adminItemInput + " in the Jar: ");
    
        maxCount = input.nextInt();
        Jar jar = new Jar(adminItemInput, maxCount);
        jar.setItemType(adminItemInput);
        jar.setMaxItemCount(maxCount);
        int randomNumberGenerator = jar.fill();
   
        System.out.println("");
        System.out.println("");  
        System.out.printf("Player%n");
        System.out.printf("=======================%n");  
        System.out.print("Your goal is to guess how many " + adminItemInput + " are in the jar? Your guess should be" +
                " between 1 and " + maxCount + ".\n Guess: ");  
        int guessInput = input.nextInt();
        int tries = 1;
                       
       while(guessInput != randomNumberGenerator) {
             if (guessInput <= maxCount) {
                guessingGame.displayPlayer(adminItemInput, maxCount);
                guessInput = input.nextInt();
                tries++;
            } /* else if (guessInput > maxCount) {  
                System.out.printf("Your guess is higher than the Maximum amount allowed, Please try again: ");
                guessInput = input.nextInt();
                tries++;
          } */
        }
        System.out.printf("You got it in " + tries + " attempt(s)");
    }
       public void displayPlayer(String itemType, int maxCnt) {
         System.out.printf("There are " + maxCnt + " " + itemType + " in the jar? Pick a number" +
                                      " between 1 and " + maxCnt + ".\n Guess: ");
                                      
    }
        
  }    