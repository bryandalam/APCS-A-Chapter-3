// ***************************************************************
//   ChargeAccount.java
//
//   The program should take as input the previous balance on the account 
//   and the total amount of additional charges during the month. The program 
//   should then compute the interest for the month, the total new balance 
//   (the previous balance plus additional charges plus interest), and the minimum payment due.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double currentBalance;  // the current balance in the bank
           double additionalCharges; // amount of additional charges
           double accountInterest = 0;          // cost of interest
           double newBalance;
           double minimumPayment = 0.0;
 
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the current balance: ");
           currentBalance = scan.nextDouble();
           System.out.println ("Enter the additional charges: ");
           additionalCharges = scan.nextDouble();
           if (currentBalance == 0) {
               accountInterest = accountInterest;
        }
           if (currentBalance > 0) {
           accountInterest = 0.02 * (currentBalance + additionalCharges);
        }
 
           // Compute the new balance and minimum payment
 
           newBalance = currentBalance + (additionalCharges + accountInterest);
           if (newBalance < 50) {
               minimumPayment = newBalance;
            }
           if (50 <= newBalance && newBalance <= 300) {
               minimumPayment = 50;
            }
           if (newBalance > 300) {
               minimumPayment = 0.2 * newBalance;
            }
 
           // Print the results
           System.out.println( "\tCS CARD INTERNATIONAL STATEMENT");
           System.out.println("\t================================");
           System.out.println("");
           System.out.println("\tPrevious Balance: \t$" + currentBalance);
           System.out.println("\tAdditional Charges: \t$" + additionalCharges);
           System.out.println("\tInterest : \t$" + accountInterest);
           System.out.println(" ");
           System.out.println("\tNew Balance: \t$" + newBalance);
           System.out.println(" ");
           System.out.println("\tMinimum Payment: \t$" + minimumPayment);
           
           
           
        }
}
