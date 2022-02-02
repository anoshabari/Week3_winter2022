
import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 * @author Anosha Bari
 * Student ID: 991626444
 */
public class CardTrick2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Card[] magicHand = new Card[7]; //Array of object 
      for (int i=0;i<magicHand.length;i++)
      {
          Card c = new Card();
          c.setNumbers(1+(int)((Math.random()*13)));//random generation for number/use method
          c.setSuit(c.SUITS[(int)((Math.random()*3))]);
          magicHand[i]=c; 
          System.out.println(c.getSuit() + " : " + c.getNumbers()); 
      
         
    }
      //step 2: take input guess the card 2 spades find in array - print your card is found
         Scanner sc = new Scanner (System.in);
         System.out.println("Guess the card number: ");
         int cardNum = sc.nextInt();
         System.out.println("Guess the card suite: ");
         String cardSuite = sc.next();
         Card userCard = new Card();
         userCard.setNumbers(cardNum);
         userCard.setSuit(cardSuite);
         System.out.println(userCard.getSuit() + " : " + userCard.getNumbers()); 
         
         for (int i=0;i<magicHand.length;i++)
         {
             if(magicHand[i].getNumbers()== userCard.getNumbers() && magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit()))
             {
                 System.out.println("Your guess was right! it was found in the index.");
                 break;
             }
             else
             {
                 System.out.println("Your guess was wrong.");
             }
         }
         
    // step 3 do change in remote repository. hard coded card details card number =2,hearts to find in array
         Card hardCoded = new Card();
         hardCoded.setNumbers(2);
         hardCoded.setSuit("hearts");
         
          for (int i=0;i<magicHand.length;i++)
         {
             if(magicHand[i].getNumbers()== hardCoded.getNumbers() && magicHand[i].getSuit().equalsIgnoreCase(hardCoded.getSuit()))
             {
                 System.out.println("Your card was right! it was found in the index." + i+1);
                 break;
             }
             else
             {
                 System.out.println("Your card was wrong.");
             }
         }
    }

}
