package Basics.LoopS;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num+=1) {
            System.out.println(num);
        }
        try (// printing no.s 1 to n 
        Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            
            for (int num = 0;num <= n ;num++ ){
                System.out.println(num);
                ;
            }
        }
    }
    
}
