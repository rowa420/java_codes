package assignment_2;
import java.util.*;
public class problem_4 {
    public static void main(String[] args) {

        HashMap<String , Integer> pocket_expenditure = new HashMap<>();
        pocket_expenditure.put("book ",120);
        pocket_expenditure.put("note book",70);
        pocket_expenditure.put("pen",20);
        pocket_expenditure.put("pencil",5);

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter name of item");
        String item=sc.next();

        int size =pocket_expenditure.size();

        if (size!= 0){
            System.out.println(" the price is "+searchItem(item));
        }
        else{
            System.out.println(" no element found");
        }

        System.out.println("the total price is "+totalSum());
    }
    public static HashMap Item(){

        HashMap<String , Integer> pocket_expenditure = new HashMap<>();
        pocket_expenditure.put("book ",120);
        pocket_expenditure.put("note book",70);
        pocket_expenditure.put("pen",20);
        pocket_expenditure.put("pencil",5);

        return pocket_expenditure;
    }



    public static int searchItem(String item){
        int price=0;
        HashMap item1=Item();
        for (Object key :item1.keySet()){
            if (key.equals(item)){
                price = (int)item1.get(key);

            }
        }

        return price;
    }
    public static int totalSum(){
        int price=0;
        HashMap item1=Item();

        for (Object key :item1.keySet()){
            price = (int)item1.get(key);
        }
        return price;
    }


}
