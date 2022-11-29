/*5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()
*/
package assignment_2;

import java.util.Scanner;


public class problem_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element ");
        int e = sc.nextInt();
        int array[]=new int[e];
        System.out.println("enter the values of array");
        for (int i=0; i < array.length;i++){

            array[i]= sc.nextInt();
        }
        int a=0;
        System.out.println( " the stored arry is -");
        for (int i =0; i< array.length;i++) {
            System.out.println(+array[i]);
            a+= array[i];
        }
        System.out.println("the sum is "+a);
        problem_5 array_1 = new problem_5();
        float avg = array_1.average(a ,e);
        System.out.println("the avarage is "+avg);
        System.out.println(" the oddNumber are -");
        array_1.oddNumber(array);
        System.out.println(" the evenNumber are -");
        array_1.evenNumber(array);
    }
    public float  average( float a,float e ){
        return a/e;
    }

    public void oddNumber(int[] array){
        for (int i =0 ; i < array.length;i++){
            if (array[i]%2!=0){
                System.out.println(array[i]);
            }
        }

    }
    public void evenNumber(int[] array){
        for(int i =0 ; i< array.length; i++){
            if (array[i]%2==0){
                System.out.println(array[i]);
            }
        }
    }
}
