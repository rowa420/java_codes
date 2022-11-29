
/*2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?
*/
package stringManipulation;


public class problem_2 {
    public static void main(String[] args) {
        problem_2 String = new problem_2();
        String.total_cost();
    }
    public void total_cost(){
        String str_1 ="Price of a formal shirt is 1200 tk and Sharee is 3500 tk";
        String str_2 = "If you buy 2 shirt and 1 sharee, then 400 tk will be discounted";
        String tk1 = str_1.split(" ")[6];
        System.out.println(tk1);
        int tk_11=Integer.parseInt(tk1);


        String tk2 = str_1.split(" ")[11];
        System.out.println(tk2);
        int tk_22=Integer.parseInt(tk2);


        String num1= str_2.split(" ")[3];
        System.out.println(num1);
        int num11=Integer.parseInt(num1);

        String num2= str_2.split(" ")[6];
        System.out.println(num2);
        int num22=Integer.parseInt(num2);

        int total_price=(tk_11*num11)+(tk_22*num22);
        System.out.println("the price is "+total_price);

        if (num11==2 && num22==1){
            int d_price=total_price-400;
            System.out.println("the total cost is"+d_price);
        }


    }
}
