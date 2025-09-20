package Basics.OtherS;

import java.util.Scanner;



public class lab2 {
    public static void main(String[] args) {
        //write a program to print the area of triangle and take hight and base as input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of the triangle: "); 
        float height = sc.nextFloat();
        float area = 0.5f * base * height;
        System.out.println("The area of the triangle is: " + area);
        sc.close(); 

        
    }
}
