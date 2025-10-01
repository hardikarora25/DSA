package Array.ARRAYquestions;

import java.util.HashMap;

public class TWOSUM {
    public static String twoSum(int n, int []arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(arr[i], i);
        }
        return "NO";
    }
    public static int[] twoSumm(int n, int []arr, int target) {
        int[] ans2 = new int[2];
        ans2[0] = ans2[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans2[0] = mpp.get(moreNeeded);
                ans2[1] = i;
                return ans2;
            }

            mpp.put(arr[i], i);
        }
        return ans2;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        int[] ans2 = twoSumm(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
        System.out.println("This is the answer for variant 2: " + ans2);
    }

}
    

