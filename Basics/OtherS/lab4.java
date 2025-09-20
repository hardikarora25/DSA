package Basics.OtherS;

public class lab4 {
    //write a program to create a class ( class name is student with data as name , city and age along with method printData to display the data.create two objects S1 and S2 to declare and access the values 
            public class student{
                String name;
                String city;
                int age;

                void printData(){
                    System.out.println("Name: " + name);
                    System.out.println("City: " + city);
                    System.out.println("Age: " + age);
                }
            
            
                
            }
            public static void main(String[] args) {
                
                student s1 = new student();
                s1.name = "Hardik";
                s1.city = "New Delhi";
                s1.age = 20;
                s1.printData();

                System.out.println();

                student s2 = new student();
                s2.name = "Aaadi";
                s2.city = "Onionpur";
                s2.age = 21;
                s2.printData();
            }
    
}
