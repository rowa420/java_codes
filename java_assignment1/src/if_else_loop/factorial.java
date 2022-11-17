/*
 6. Write  a program to find the factorial of a given number
 */
package if_else_loop;

import java.util.Scanner;

/**
 * @ktr
 */
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int number;
            int factorial=1;
            number = sc.nextInt();
            for (int counter=1;counter<=number;counter++){
                factorial=factorial*counter;
            
            }
            System.out.println("the factorial of the number is "+factorial);
        
    }
}
