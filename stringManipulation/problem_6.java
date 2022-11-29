/*
* 6. Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim lives in Rangpur
Output: Ratul and Fahim lives in Rangpur
* */


package stringManipulation;

import java.util.Objects;
import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        problem_6 String = new problem_6();
        String.change();

    }
    public void change(){
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("the string is-"+str);

        String newStr= str.substring(str.indexOf("Rah"),str.indexOf("Rah")+5);
        System.out.println(newStr);
        if (Objects.equals(newStr, "Rahim"))
        {
            String output = str.replace("Rahim", "Fahim")  ;
            System.out.println(output);
        }

    }
}
