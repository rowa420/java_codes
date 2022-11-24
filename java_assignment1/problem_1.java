/*1. Take input from a user and check if the number exists in the array
let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3
Input: 9
Output: Found no element */

package assignment_2;

import java.util.Scanner;

public class problem_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {1, 3, 5, 7, 2, 4, 6, 8};

        System.out.println("enter the input number");
        int number = sc.nextInt();


            for(int i=0;i<num.length;i++){
                if (num[i]== number){
                    System.out.println("Found in the position"+i);
                }
                break;
            }
                System.out.println("Found no element");



    }
}
