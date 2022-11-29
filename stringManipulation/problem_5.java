/*
*5. Write a program that will count how many vowels in the given string:
"roadtosdet"
Output: 4
* */

package stringManipulation;

public class problem_5 {
    public static void main(String[] args) {
        problem_5 String = new problem_5();
        String.vowel();

    }
    public void vowel(){
        String str="roadtosdet";
        char ch[]=str.toCharArray();
        int num=0;
        for(char c :ch ){

            switch (c){
                case 'a': ;
                case 'e': ;
                case 'i': ;
                case 'o': ;
                case 'u': ;
                num+=1;
            }

        }
        System.out.println(num);


    }
}
