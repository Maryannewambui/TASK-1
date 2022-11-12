package com.mycompany.task1.d;

public class Task1D {

    public static void main(String[] args) {
        //71...150
   
        for(int num=71; num<=150; num++){
         
            if(num%2==0)
            {
                System.out.println("multiples of 2:"+num);
            }
        }
        
        for(int num=71; num<=150; num++){
         
            if(num%3==0)
            {
                System.out.println("multiples of 3:"+num);
            }
        }
        
        for(int num=71; num<=150; num++){
         
            if(num%7==0)
            {
                System.out.println("multiples of 7:"+num);
            }
        }
        
    }
}
