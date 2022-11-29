/*1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
Output: TXN123456*/

package stringManipulation;

import java.util.*;

public class problem_1 {
    public static void main(String[] args) {
        problem_1 String = new problem_1();
        String.extract();
    }
    public void extract(){
        String html=" <html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is:TXN123456\n" +
                "</body>\n" +
                "</html> ";
        String str = html.substring(html.indexOf("TX"),html.indexOf("TX")+9);
        System.out.println(str);

    }
}
