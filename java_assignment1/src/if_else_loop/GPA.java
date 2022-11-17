/*
 * 2. Write a program to calculate GPA and find grade
 */
package if_else_loop;

import java.util.Scanner;

/**
 * @ktr
 */
public class GPA {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter numbers of subjects(consider maximum 8& minimum5");
        
        int subjects;
        
         subjects = sc.nextInt();
         
         if (subjects==5){
             System.out.println("enter the marks");
             float a;
             float b;
             float c;
             float d;
             float e;
             
             float cradits1 ;
             float cradits2 ,cradits3,cradits4 ,cradits5;
             
            
             
             a = sc.nextFloat();
             b = sc.nextFloat();
             c = sc.nextFloat();
             d = sc.nextFloat();
             e = sc.nextFloat();
             
             System.out.println("enter cradits for each (not more then 4)");
             cradits1 = sc.nextFloat();
             cradits2 = sc.nextFloat();
             cradits3 = sc.nextFloat();
             cradits4 = sc.nextFloat();
             cradits5 = sc.nextFloat();
             
             
                    float r1=
                    (a*cradits1);
                    float r2=
                    (b*cradits2);
                    float r3=
                    (c*cradits3);
                    float r4=
                    (d*cradits4);
                    float r5=
                    (e*cradits5);
                    
                  float total_points=(r1+r2+r3+r4+r5);  
                  
                  float total_cradit=(cradits1+cradits2+cradits3+cradits4+cradits5);
                  
                  
                  float gpa=(total_points/total_cradit);
                  System.out.println("the gpa is "+gpa);
                  
                  if (gpa ==4.00)
                  {
                      System.out.println("A+");
                  }
                  else if(gpa>=3.75 && gpa<4.00){
                      System.out.println("A");
                  }
                  else if(gpa>=3.50 && gpa<3.75){
                      System.out.println("A-");
                  }else if(gpa>=3.25&& gpa<3.50){
                      System.out.println("B+");
                  }
                  else if (gpa>=3.00 && gpa<3.25)
                  {
                      System.out.println("B");
                  }
                  else if (gpa>=2.75 && gpa>3.00){
                      System.out.println("b-");
                  }
                  else if (gpa >=2.50 && gpa>2.75){
                      System.out.println("C+");
                  }
                  else if (gpa >=2.25 && gpa>2.50){
                      System.out.println("C");
                  }
                  else if (gpa >=2.00&& gpa>2.25){
                      System.out.println("D");
                  }
                  else if (gpa <2.00){
                      System.out.println("F");
                  }
                  else{}
         
                }
        
                 
         
        
         else if (subjects==6){
             System.out.println("enter the marks");
             float a;
             float b;
             float c;
             float d;
             float e;
             float f;
             
             
             
             float cradits1 ;
             float cradits2 ,cradits3,cradits4 ,cradits5, cradits6;
             
            
             
             a = sc.nextFloat();
             b = sc.nextFloat();
             c = sc.nextFloat();
             d = sc.nextFloat();
             e = sc.nextFloat();
             f = sc.nextFloat();
             
             
             System.out.println("enter cradits for each (not more then 4)");
             
             cradits1 = sc.nextFloat();
             cradits2 = sc.nextFloat();
             cradits3 = sc.nextFloat();
             cradits4 = sc.nextFloat();
             cradits5 = sc.nextFloat();
             cradits6 = sc.nextFloat();
             
             
                    float r1=
                    (a*cradits1);
                    float r2=
                    (b*cradits2);
                    float r3=
                    (c*cradits3);
                    float r4=
                    (d*cradits4);
                    float r5=
                    (e*cradits5);
                    float r6=
                    (f*cradits6);
                    
                    
                  float total_points=(r1+r2+r3+r4+r5+r6);  
                  
                  float total_cradit=(cradits1+cradits2+cradits3+cradits4+cradits5+cradits6);
                  
                  
                  float gpa=(total_points/total_cradit);
                  System.out.println("the gpa is "+gpa);
                    
                  if (gpa ==4.00)
                  {
                      System.out.println("A+");
                  }
                  else if(gpa>=3.75 && gpa<4.00){
                      System.out.println("A");
                  }
                  else if(gpa>=3.50 && gpa<3.75){
                      System.out.println("A-");
                  }else if(gpa>=3.25&& gpa<3.50){
                      System.out.println("B+");
                  }
                  else if (gpa>=3.00 && gpa<3.25)
                  {
                      System.out.println("B");
                  }
                  else if (gpa>=2.75 && gpa>3.00){
                      System.out.println("b-");
                  }
                  else if (gpa >=2.50 && gpa>2.75){
                      System.out.println("C+");
                  }
                  else if (gpa >=2.25 && gpa>2.50){
                      System.out.println("C");
                  }
                  else if (gpa >=2.00&& gpa>2.25){
                      System.out.println("D");
                  }
                  else if (gpa <2.00){
                      System.out.println("F");
                  }
                  else{}
         }
         else if (subjects==7){
             System.out.println("enter the marks");
             float a;
             float b;
             float c;
             float d;
             float e;
             float f;
             float g;
             
             
             
             float cradits1 ;
             float cradits2 ,cradits3,cradits4 ,cradits5, cradits6,cradits7;
             
            
             
             a = sc.nextFloat();
             b = sc.nextFloat();
             c = sc.nextFloat();
             d = sc.nextFloat();
             e = sc.nextFloat();
             f = sc.nextFloat();
             g = sc.nextFloat(); 
             
             System.out.println("enter cradits for each (not more then 4)");
             
              cradits1 = sc.nextFloat();
             cradits2 = sc.nextFloat();
             cradits3 = sc.nextFloat();
             cradits4 = sc.nextFloat();
             cradits5 = sc.nextFloat();
             cradits6 = sc.nextFloat();
             cradits7 = sc.nextFloat();
             
             
             
                    float r1=
                    (a*cradits1);
                    float r2=
                    (b*cradits2);
                    float r3=
                    (c*cradits3);
                    float r4=
                    (d*cradits4);
                    float r5=
                    (e*cradits5);
                    float r6=
                    (f*cradits6);
                    float r7=
                    (g*cradits6);
                    
                    
                  float total_points=(r1+r2+r3+r4+r5+r6+r7);  
                  
                  float total_cradit=(cradits1+cradits2+cradits3+cradits4+cradits5+cradits6+cradits7);
                  
                  
                  float gpa=(total_points/total_cradit);
                  System.out.println("the gpa is "+gpa);
                    
                  if (gpa ==4.00)
                  {
                      System.out.println("A+");
                  }
                  else if(gpa>=3.75 && gpa<4.00){
                      System.out.println("A");
                  }
                  else if(gpa>=3.50 && gpa<3.75){
                      System.out.println("A-");
                  }else if(gpa>=3.25&& gpa<3.50){
                      System.out.println("B+");
                  }
                  else if (gpa>=3.00 && gpa<3.25)
                  {
                      System.out.println("B");
                  }
                  else if (gpa>=2.75 && gpa>3.00){
                      System.out.println("b-");
                  }
                  else if (gpa >=2.50 && gpa>2.75){
                      System.out.println("C+");
                  }
                  else if (gpa >=2.25 && gpa>2.50){
                      System.out.println("C");
                  }
                  else if (gpa >=2.00&& gpa>2.25){
                      System.out.println("D");
                  }
                  else if (gpa <2.00){
                      System.out.println("F");
                  }
                  else{}
         }
         else if (subjects==8){
             System.out.println("enter the points(not more then 4)");
             float a;
             float b;
             float c;
             float d;
             float e;
             float f;
             float g;
             float h;
             
             
             
             float cradits1 ;
             float cradits2 ,cradits3,cradits4 ,cradits5, cradits6,cradits7,cradits8;
             
            
             
             a = sc.nextFloat();
             b = sc.nextFloat();
             c = sc.nextFloat();
             d = sc.nextFloat();
             e = sc.nextFloat();
             f = sc.nextFloat();
             g = sc.nextFloat(); 
             h = sc.nextFloat();
             
             
             System.out.println("enter cradits for each (not more then 4)");
             
             cradits1 = sc.nextFloat();
             cradits2 = sc.nextFloat();
             cradits3 = sc.nextFloat();
             cradits4 = sc.nextFloat();
             cradits5 = sc.nextFloat();
             cradits6 = sc.nextFloat();
             cradits7 = sc.nextFloat();
             cradits8 = sc.nextFloat();
             
             
                    float r1=
                    (a*cradits1);
                    float r2=
                    (b*cradits2);
                    float r3=
                    (c*cradits3);
                    float r4=
                    (d*cradits4);
                    float r5=
                    (e*cradits5);
                    float r6=
                    (f*cradits6);
                    float r7=
                    (g*cradits6);
                    float r8=
                    (h*cradits6);
                    
                    
                  float total_points=(r1+r2+r3+r4+r5+r6+r7+r8);  
                  
                  float total_cradit=(cradits1+cradits2+cradits3+cradits4+cradits5+cradits6+cradits7+cradits8);
                  
                  
                  float gpa=(total_points/total_cradit);
                  System.out.println("the gpa is "+gpa);
         
                    if (gpa ==4.00)
                  {
                      System.out.println("A+");
                  }
                  else if(gpa>=3.75 && gpa<4.00){
                      System.out.println("A");
                  }
                  else if(gpa>=3.50 && gpa<3.75){
                      System.out.println("A-");
                  }else if(gpa>=3.25&& gpa<3.50){
                      System.out.println("B+");
                  }
                  else if (gpa>=3.00 && gpa<3.25)
                  {
                      System.out.println("B");
                  }
                  else if (gpa>=2.75 && gpa>3.00){
                      System.out.println("b-");
                  }
                  else if (gpa >=2.50 && gpa>2.75){
                      System.out.println("C+");
                  }
                  else if (gpa >=2.25 && gpa>2.50){
                      System.out.println("C");
                  }
                  else if (gpa >=2.00&& gpa>2.25){
                      System.out.println("D");
                  }
                  else if (gpa <2.00){
                      System.out.println("F");
                  }
                  else{}
         }
         else{}
    }
}
