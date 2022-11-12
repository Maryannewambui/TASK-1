package com.mycompany.task1.c;
import java.util.Scanner;

public class Task1C {
    //declare variable 
 static int num;
 
    public static void main(String[] args) {
        //check divisibility of integer in a range of0-9
     Scanner input= new Scanner(System.in);
     
     System.out.println("enter the number:");
     num= input.nextInt();
     
     //for statment 
     //integer is divisible by integers in the range of o-9
     for(int i=1;1<=num;i++){
         if (num%i==0)
             System.out.print("the number is divisible by"+i);
     }
    
}
}