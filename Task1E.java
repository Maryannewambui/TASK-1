package com.mycompany.task1.e;
import java.util.Scanner;

public class Task1E {

    public static void main(String[] args) {
       //Declaring variables
       double n_1, n_2;
       char operator;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Enter first number:");
        n_1 =input.nextDouble();
       System.out.println("Enter the second number:");
        n_2 =input.nextDouble();
       System.out.println("Enter the operator:");
        operator = input.next().charAt(0);
        
        input.close();
        
        switch( operator ){
            case '+' -> System.out.printf("%.1f + %.1f= %.1f", n_1,n_2,(n_1+n_2));
               
                case '-' -> System.out.printf("%.1f - %.1f= %.1f", n_1,n_2,(n_1-n_2));
                
                case '*' -> System.out.printf("%.1f * %f= %.1f", n_1,n_2,(n_1*n_2));
                
                case'/' -> {
                    if(n_2!=0)
                        System.out.printf("%.1f / %.1f = %.1f", n_1,n_2,(n_1/n_2));
                    else
                        System.out.println("Dividee by zero situation");
            }
                    
                    default -> System.out.printf("%c is an invalid operator",operator);
                        
                    
        }
        
    }
}
