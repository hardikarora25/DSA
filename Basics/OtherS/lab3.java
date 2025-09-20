package Basics.OtherS;

import java.util.Scanner;



public class lab3 {
    public static void main(String[] args) {
        //write a program to check if the number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int num = sc.nextInt();
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                System.out.println(num + " is not a prime number");
                return;
            }
            else{
                System.out.println(num + " is a prime number");
                return;
            }
        }
        
      
    }
    
}
