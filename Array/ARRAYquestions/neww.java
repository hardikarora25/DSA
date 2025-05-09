package Array.ARRAYquestions;

public class neww {
    public static void main(String[] args) {
        /*to find the second largest number in an array  */
        int hr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("The Second Largest element in the array is: " + findSecondLargestElement(hr1)); // 3

    }
    static int findSecondLargestElement(int hrr[]) {
        int max = hrr[0];
        int secondmax = hrr[0];
        for (int i = 0; i < hrr.length; i++) {
            if (hrr[i] > max) {
                secondmax = max;
                max = hrr[i];
            } else if (hrr[i] > secondmax && hrr[i] != max) {
                secondmax = hrr[i];
            }
        }
        return secondmax;   
    
}

    
}