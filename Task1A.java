package com.mycompany.task1.a;
import java.util.Scanner;

public class Task1A {
    static String charsinstr;
    static int age, count=0;
    
    public static void main(String[] args) {
       //user to enter their sure name
       
       Scanner input= new Scanner(System.in);
       System.out.println("Enter your surname:\n");
       charsinstr=input.next();
       //enter age
       System.out.println("Enter your age:\n");
       age = input.nextInt();
       
      for(int i=0;i<charsinstr.length();i++)
      {
          if(charsinstr.charAt(i) !=' ');
          {
          count++;
          
      }
      }
       System.out.println("\n the number of characters is" +count);
     
       
       if (age % 2==0)
           System.out.println(age+"is even");
       else System.out.println("your current age is"  +" is odd ");
       
       
    }
}
