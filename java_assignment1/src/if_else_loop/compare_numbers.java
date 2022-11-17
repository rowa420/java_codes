/*
 3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241
 */
package if_else_loop;

import java.util.Scanner;

/**
 
 * @ktr
 */
public class compare_numbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    System.out.println("Input first floating­point number: "); 
        double num1 = sc.nextDouble(); 
        System.out.print("Input second floating­point number: "); 
        double num2 = sc.nextDouble(); 
    sc.close(); 
  
    if (Math.abs(num1 - num2) <= 0.01) { 
     System.out.println("These numbers are the same."); 
        } 
    else { 
     System.out.println("These numbers are different."); 
        } 
    }
   
    
        } 
    
    

