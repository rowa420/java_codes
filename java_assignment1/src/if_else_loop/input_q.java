/*
 9. Write a program to sum of user input until users input ‘q’ from keyboard
 */
package if_else_loop;

import java.util.Scanner;

/**
 *
 * @ktr
 */
public class input_q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
         int i=1;
         System.out.println("enter your number to create sum and 'q' to quit ");
        
       
         
        while(sc.hasNextInt()){
            
        int number= sc.nextInt();
        sum +=number;
            System.out.println("the sum is "+sum);
        i++;
        
        System.out.println("enter your number to create sum and 'q' to quit ");
        }
        System.out.println("the sum is "+sum);
    }
}
