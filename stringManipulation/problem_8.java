/*8. Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives in Sylhet
* */

package stringManipulation;

import java.util.*;

public class problem_8 {
    public static void main(String[] args) {
        problem_8 String=new problem_8();
        String.to_up_case();
    }
    public void to_up_case(){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] str1=str.toCharArray();
        boolean gap=true;
        for(int i=0;i<str1.length;i++){
            if (Character.isLetter(str1[i])){
                if(gap){
                    str1[i]=Character.toUpperCase(str1[i]);
                    gap=false;
                }
            }
            else{
                gap=true;
            }
        }

       String output=String.valueOf(str1);
        System.out.println(output);



    }
}
