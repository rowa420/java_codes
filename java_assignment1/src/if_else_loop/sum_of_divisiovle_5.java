/*
 5. Write a program to sum of numbers which only divisible by 5 from 1 to 100
 */
package if_else_loop;

/**
 * @ktr
 */
public class sum_of_divisiovle_5 {
    public static void main(String[] args) {
        int sum=0 ;
        int number = 100 ;
        
            for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
            System.out.println(i + " ");
            sum +=i;
            }
        }
            System.out.println("the sum is "+sum);
    }
}
