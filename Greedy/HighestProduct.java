package InterviewBit.InterviewBit.Greedy;

import java.util.Arrays;

public class HighestProduct {
    
    public static void main(String[] args) {
        int[] A = {0, -1, 3, 100, 70, 50};
        HighestProduct hp = new HighestProduct();
        System.out.println(hp.maxp3(A));
    }
    
    public int maxp3(int[] A) {
        
        int size = A.length;
        Arrays.sort(A);
        int allPositives = A[size-1]*A[size-2]*A[size-3];
        int twoNegatives = A[0]*A[1]*A[size-1];
        int res = Math.max(allPositives, twoNegatives);
        return res;
    }
}
