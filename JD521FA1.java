/*
 * This code was written by Sjanrie Sanya Hendrikz
 * ICAS Number: 20230667
 * Campus: Port Elizabeth
 */

package com.mycompany.jd521fa1;

import java.util.Scanner;

public class JD521FA1 {
    // The data type 'double' is chosen in case the user enters a decimal value.
    private static  Double Account_Balance = 0.00; 
    private static Double Intrest_earned = 0.00; 
       
    public static void main(String[] args) {
        // I gave the name enterval to my scanner. It is short for 'enter value'.
        Scanner enterval = new Scanner(System.in); 
         System.out.println("Please enter your full name: " );
          String Full_name = enterval.nextLine();
           System.out.println("_____________________________" );
            System.out.println("");
             System.out.println("Welcome to CTU Banking, \n" + Full_name);
              System.out.println("");
               System.out.println("*****************************" );
                System.out.println("");
        
          while (true) { 
              try{
              // The format of  the menue was created by someone for my class. He gave me permission to use his design. 
              System.out.println("""
                            ________________________________
                           |                                |
                           |              MENU              |
                           |________________________________|
                                 
                             1) Display all account details 
                             2) Deposit the amount          
                             3) Save the amount             
                             4) Withdraw the amount         
                             5) Exit                        
                            _______________________________
                           """);
               // Let the user choose an option from the menu.
              System.out.println("Please select an option between 1 to 5: "  );
               System.out.println("________________________________________" );
              int choice = enterval.nextInt(); 
              System.out.println(" ");
              
              switch (choice){
                  case 1:
                      // Let the user know what option they have chosen
                       System.out.println("____________________________" );
                        System.out.println("You have selected option: " + choice);
                      // This is to separate the option choice with the information that will be given to the user. 
                       System.out.println("____________________________" );
                        System.out.println(" ");
                      
                      if (choice == 1){
                          // If the user has chosen option 1, display a welcome message with their name and their account balance and interest rate.
                          System.out.println("Welcome, " + Full_name);
                           System.out.println("____________________________" );
                            System.out.println(" ");
                          // Display account balance
                          System.out.println("Your account balance is: R" + Account_Balance ); 
                           System.out.println(" ");
                          // Display account interest rate
                          System.out.println("Your current account intrest rate is: R" + Intrest_earned ); 
                           System.out.println(" ");
                            System.out.println("*******************************************" );
                      }
                      break;
                       
                       case 2:
                           // Let the user know what option they have chosen.
                            System.out.println("____________________________" );
                             System.out.println("You have selected option: " + choice);
                              System.out.println("____________________________" );
                               System.out.println(" ");
                            
                           if (choice == 2){
                               // Let the user input the amount that they want into their account.
                               System.out.println("Enter the amount you want to deposit into your account R: " ); 
                               double Dep_amount = enterval.nextDouble();
                               System.out.println(" ");
                               Account_Balance +=  Dep_amount;
                               // Let the user know that their money has been added to their account.
                               System.out.println("R" +  Dep_amount + " has been added to your account." ); 
                                System.out.println("");
                                 System.out.println("****************************************" );
                           }
                           break;
                           
                           case 3:
                               // Let the user know what option they have chosen.
                                System.out.println("____________________________" );
                                 System.out.println("You have selected option: " + choice);
                                  System.out.println("____________________________" );
                                   System.out.println(" ");
                               // Let the user add money to their savings.
                               System.out.println("Please enter the amount you want in add to your savings R: ");
                               double Save_amount = enterval.nextDouble();
                               System.out.println(" ");
                               // Let the user enter the duration of their savings.
                               System.out.println("Please enter the duration ( in months ) you want your savings:  ");
                               int Save_duration = enterval.nextInt();
                               System.out.println("______________________________________________________________ " );
                               double Intrest = 0.00 ;
                               System.out.println(" ");
                              
                               // Calculate the interest as per the rubric requires. 
                               // If the users savingd amount range is between 100 and 500, the interest per month is 0.05%.
                               if(Save_amount >= 100 && Save_amount <= 500 ){
                                    Intrest = 0.05 * Save_duration;
                               }
                               
                                // If the users savingd amount range is between 501 and 1000, the interest per month is 0.20%
                               else if (Save_amount >= 501 && Save_amount <= 1000){
                                   Intrest = 0.20 * Save_duration;
                               }
                               
                                // If the users savingd amount range is higher then 1001, the interest per month is 0.50%
                               else if (Save_amount >= 1001){
                                   Intrest = 0.50 * Save_duration;
                               }
                               
                               // Let the user know that they can't save money below R100.
                               else if(Save_amount <= 99){
                                   System.out.println(Full_name + ", unfortunately you have not entered the required amount to be saved.\n "
                                           + "The minimum amount that must be saved is R100.");
                                     System.out.println("********************************************************************************" );
                                      System.out.println(" ");
                               }
                               
                               // If account balance is higher than savings, calculate the interest gained.
                               if (Save_amount < Account_Balance){
                                   double Intrestrate = Save_amount * Intrest ;
                                   Intrest_earned += Intrestrate;
                                   // Add the interest and savings amount to the users account balance.
                                   Account_Balance += Save_amount + Intrest ;
                                   System.out.println(" ");
                                    System.out.println("Savings successful. Your interest earned is: R" + Intrest_earned);
                                     System.out.println(" ");
                                      System.out.println("*****************************************************" );
                               }
                               
                               // Let the user know that their saving can't be more than what they have in the bank.
                               else {
                                   System.out.println(Full_name + " the balance of your savings account can't be higher than the balance of your bank account. "
                                           + "\n The limit that you can save is R" +Account_Balance  );
                                   System.out.println(" ");
                                    System.out.println("*****************************************************************************************************" );
                               }
                               break;
                               
                               case 4:
                                   // Let the user know what option they have chosen.
                                    System.out.println("____________________________" );
                                     System.out.println("You have selected option: " + choice);
                                      System.out.println("____________________________" );
                                       System.out.println(" ");
                                   
                                   if (choice == 4){
                                       // Before the user withdraws money from their account, let them know what their balance is.
                                       System.out.println(Full_name + " currently you have R"+ Account_Balance + " in your bank account.");
                                        System.out.println(" ");
                                       // Let the user withdraw money from their account.
                                       System.out.println("Please enter the amount you want to withdraw from your account R: " ); 
                                       double Withdraw_Amount = enterval.nextDouble();
                                        System.out.println(" ");
                                         System.out.println("___________________________________________________________________" );
                                       
                                        // If the withdrawl amount is higher than the users account balance, display an error message.
                                       if (Withdraw_Amount > Account_Balance){
                                           System.out.println(" ");
                                            System.out.println("Your request to withdraw money has been denied. \n You cannot withdraw an amount that is higher than your bank account balance." );
                                             System.out.println(" ");
                                              System.out.println("Currently you have R"+ Account_Balance + " in your bank account.");
                                               System.out.println(" ");
                                                System.out.println("**************************************************************" );
                                       } 
                                       
                                        // If the withdrawl amount is smaller than the users account balance, proceed.
                                       else if (Withdraw_Amount < Account_Balance){
                                           // Let the user know their withdrawl has been accepted.
                                           System.out.println(" ");
                                            System.out.println("Your withdrawl amount has been accepted!" ); 
                                             System.out.println(" ");
                                           Account_Balance -= Withdraw_Amount;
                                           // Let the user know how much money was withdrawn and what their new account balance is.
                                           System.out.println("R" + Withdraw_Amount + " has been withdrawn from your account." ); 
                                            System.out.println("Currently you have R"+ Account_Balance + " in your bank account.");
                                             System.out.println(" ");
                                              System.out.println("***************************************************************" );
                                       }
                                   } 
                                   break; 
                                   
                                   case 5:
                                   // Let the user know what option they have chosen.
                                    System.out.println("____________________________" );
                                     System.out.println("You have selected option: " + choice);
                                      System.out.println("____________________________" );
                                       System.out.println(" ");
                                   // Display a 'Goodbye' message.
                                   System.out.println("Thank you for using the CTU Banking Application." ); 
                                    System.out.println(" ");
                                     System.out.println("Have a wonderful day. Goodbye");
                                      System.out.println(" ");
                                       System.out.println("********************************************" );
                                        System.exit(0); 
                                   break; 
                                   
                                   // if the user does not choos one of the given options, an error message will appear.
                                   default:    
                                     System.out.println("Sorry, that is an invalid menu option. \n Please select a better option.");
                                      System.out.println(" ");
                                       System.out.println("*************************************" );
                                   break;
              } 
             
          } 
          // If the user does not enter the correct integer value, the program will quit and an error message will appear.
          catch(Exception e)  
                  {  
                  System.out.println(" ");   
                   System.out.println("Unfortunately, the program has failed. The possible resaon could be: \n"+ e +"\n A possible solution could be to use non decimal numbers."); 
                    System.out.println(" " );
                     System.out.println("*******************************************************************" );
                  break;
                  }
    } 
}
}