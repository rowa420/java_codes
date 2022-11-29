
/*
* 4. Writea program that will give following output:
Input: chattogram
Output: C8M
* */
package stringManipulation;

import java.util.*;

public class problem_4 {
    public static void main(String[] args) {

            System.out.println(" enter value ");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            System.out.println("the String is " + a);

            if (Objects.equals(a, "chattogram")) {
                String output;
                output = a.replaceAll("chattogram", "C8M");
                System.out.println(output);

            } else {
                System.out.println(a);
            }
    }
}
