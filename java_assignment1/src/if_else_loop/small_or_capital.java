/*
 1. Write a program to check if inputted letter is small or capital
 */
package if_else_loop;

import java.util.Scanner;

/**
 * @ktr
 */
public class small_or_capital {
    
    public static void main(String[] args) {
        
        char ch;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter an character");
        
        ch = sc.next().charAt(0);
        
        if(ch>=65 && ch<=90){
            System.out.println("capital letter");
        }
        else if(ch>=97 && ch<=122)
        {
            System.out.println("small letter");
        }
        else{
            System.out.println("some thing else");
        }
    }
}
