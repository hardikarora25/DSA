package Basics.LoopS;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        System.out.println("enter the third number ");
        int c = in.nextInt();
        
        // find the largest of three no.??
        int max = a;
        if (b > max){
            max = b;
        } 
        if (c > max){
            max = c;
        }
        System.out.println(max);
    }
    
}
