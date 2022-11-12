package com.mycompany.task1.b;
import java.util.Scanner;
public class Task1B {
    //Declaring variables
    static double u_1, u_2, u_3, u_4, u_5, average;

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //enter input
    System.out.println("Enter marks for unit 1:");
    u_1=input.nextDouble();
    
    System.out.println("Enter marks for unit 2:");
    u_2=input.nextDouble();
    
    System.out.println("Enter marks for unit 3:");
    u_3=input.nextDouble();
    
    System.out.println("Enter marks for unit 4:");
    u_4=input.nextDouble();
    
    System.out.println("Enter marks for unit 5:");
    u_5=input.nextDouble();
    
    average=(u_1 + u_2 + u_3 +  u_4+ u_5)/5;
    System.out.println("The average is:"+average);
    }
}
