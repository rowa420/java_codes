package assignment_2;

import java.util.HashMap;
import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        String name = "admin";
        String pass = "admin@123";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name and password");
        String name1 =sc.next();
        String pass1 =sc.next();
        

           if (name1==name &&pass==pass1){
               System.out.println("welcome admin");

           }
           else  {
            for(int i =0 ; i < 3 ;i++){
               if (i<2) {
                   System.out.println("enter the name and password");
                   name1 =sc.next();
                    pass1 =sc.next();
                   if (name1 != name && pass == pass1 || name1 == name && pass != pass1 || name1 != name && pass != pass1) {


                   }
                   else if (name1==name &&pass==pass1){
                       System.out.println("welcome admin");

                   }

               }
               else if (i==2){
                   System.out.println(" Your user has been temporary locked");
               }

            }
           }



    }
}
