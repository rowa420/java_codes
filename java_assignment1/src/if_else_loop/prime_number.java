/*
 7. Write a program to print prime numbers from 2 to n
 */
package if_else_loop;

import java.util.Scanner;

/**
 * @ktr
 */
public class prime_number {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        int i, j,flag;

        System.out.println("Enter the integer number:");
        int number = input.nextInt();

        System.out.println("Enter the integer number:");
        int count = input.nextInt();

        /// checking if the number will be prime number or not.
        for (i = number; i <= count; i++) {

            if (i == 1 || i == 0)
                continue;
                flag = 1;

            for (j = 2; j <= i / 2; ++j) {

                if (i % j == 0) {
                    flag = 0;
                    break;
                }

            }

            if (flag == 1) {
                System.out.println(i+" is the prime number");
            }
            else {
                System.out.println(i+" is not a prime number");
            }

        }

    
    }   
}