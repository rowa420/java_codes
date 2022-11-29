package assignment_2;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        int note[] ={1000,500,100,50,20,10,5,2,1};
        System.out.println("enter the amount");
        int a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 0 ; i < note.length;i++){

            int result= a/note[i];
            a=a-result*note[i];
            if ( result!=0){
                System.out.println(note[i]+ "  "+result);
            }

        }
    }
}
