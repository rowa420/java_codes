/*
4. Write a program to check balance and withdraw money from ATM booth using if else or switch case
 */
package if_else_loop;

import java.util.Scanner;

/**
 * @ktr
 */
public class ATM_booth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int balance=10000;
        
        int password=123456;
        int account_number = 123456789;
        int pass;
        int account;
        int press1=1;
        int press2=2;
        
        System.out.println("enter your account & password");
            account = sc.nextInt();
            pass = sc.nextInt();
       
           
        
        if(pass==password && account==account_number){
            System.out.println("enter one value");
         int press = sc.nextInt();
            if(press == press1){
                System.out.println("your current balance is "+balance);
                
            }
            else if (press == press2){
                System.out.println("Enter your amount");
                int amount = sc.nextInt();
                 balance=(balance-amount);
                System.out.println(" the new balance is "+balance);
                System.out.println("/t thank you /t");
                    
            }
            else{
            }
            
        } 
        else if(pass != password || account_number !=account){
            System.out.println(" sorry wrong pass or account /n try again");
             for (int counter=1; counter<=2; counter++)
        {
            System.out.println("enter your account_number & password");
            account = sc.nextInt();
            pass = sc.nextInt();
            
                if(account_number==account && pass==password)
                {
                
                System.out.println("sorry wrong password");
                }
                else if(account_number==account && pass==password)
                {
                
                int press = sc.nextInt();
                    if(press == press1){
                    System.out.println("your current balance is "+balance);
                
                    }
                        else if (press == press2){
                    System.out.println("Enter your amount");
                    int amount = sc.nextInt();
                    balance=(balance-amount);
                    System.out.println(" the new balance is "+balance);
                    System.out.println("/t thank you /t");
                        
                    }
                    else{   
                    }
                }
                else{}
            }
        }  
    }

}
