package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Printingarray {


    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);       
    int[] rollnos = new int[5];
    for(int i=0; i < rollnos.length ; i++){
        rollnos[i]= in.nextInt();

    }
    // THis is one of the methods to print an array .
    System.out.println(Arrays.toString(rollnos));

    
}
}