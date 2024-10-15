package Array.LOOPS;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // print nos 1 to 5 
        /* syntax of for loops:
           for (initialisation;condition,increment/decrement) {
           //body
           }
        
        */ 
        // print nos 1 to 5
        for (int num = 1; num <= 450; num += 90) {
            System.out.println(num);
        }
        // print numbers fro 1 to n 
        Scanner in = NEW Scanner(System.in);
        int n = in.nextLine();
        for (int num =1; num <= n; num ++){
            System.out.println(num);
             
        }
        
        
        
    
    
}
}
