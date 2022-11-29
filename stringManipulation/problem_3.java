/*
* 3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
* */

package stringManipulation;

public class problem_3 {
    public static void main(String[] args) {
        problem_3 String = new problem_3();
        String.price();
    }
    public void price(){
        String str="core i 7 Hp laptop price is 76000";
        String tk=str.split(" ")[7];
        System.out.println(tk);
        int tk1= Integer.parseInt(tk);
        System.out.println(tk1);
        double d=10.0/100.0*tk1;
        System.out.println(d);
        double price1=tk1-d;
        System.out.println(price1);


    }
}
