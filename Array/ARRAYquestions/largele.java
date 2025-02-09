package Array.ARRAYquestions;
public class largele {
 
  public static void main(String args[]) {
 
    int hr1[] =  {2,5,1,3,0};
    System.out.println("The Largest element in the array is: "+findLargestElement(hr1
    ));
 
    int hr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: "+findLargestElement(hr2
    ));
  }
  static int findLargestElement(int hrr[]) {
    int max= hrr[0];
    for (int i = 0; i < hrr.length; i++) {
      if (hrr[i] > max) {
        max= hrr[i];
      }
    }
    return max;
  }
}


