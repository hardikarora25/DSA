package Basics.OtherS;

import java.util.Scanner;

public class studenTest {
    public static class student{
        String name;
        String city;
        int age;

        void printData(){
            System.out.println("Name: " + name);
            System.out.println("City: " + city);
            System.out.println("Age: " + age);
        }
        void getdata(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");   
            name = sc.nextLine();
            System.out.print("Enter city: ");
            city = sc.nextLine();
            System.out.print("Enter age: ");
            age = sc.nextInt();
            
        }

    }
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.getdata();
        s1.printData();

        System.out.println();

        student s2 = new student();
        s2.getdata();
        s2.printData();
    }
    
}
