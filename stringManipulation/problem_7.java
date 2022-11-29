/*
* 7. Find out how many images are in the given array:
["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
Output: 3
* */

package stringManipulation;

public class problem_7 {
    public static void main(String[] args) {
        problem_7 String = new problem_7();
        String.image_found();


    }
    public void image_found(){
        String[] str={"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
         int c = 0;
         for(String r:str){
             if(r .contains(".jpg")||r.contains(".png")){
                 c+=1;
             }
         }
        System.out.println(c);
    }

}
