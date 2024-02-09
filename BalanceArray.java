package InterviewBit.InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalanceArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(5, 5, 2, 5, 8));
        // ArrayList<Integer> A = new ArrayList<>(List.of(10));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int n=A.size();

        // {0,1,2,3,4,5} --> removing 2nd index {0,1,|3,4,5} 
        //                      --> new index = {0,1,|2,3,4} 
        // notice left of the ith index have same odd even index, right side, odd even indexes are swapped
        // odd index sum = odd index sum left of i + even index sum right of i
        // even index sum = even index sum left of i + odd index sum right of i
        
        // create odd and even indexed prefix sum array   
        int[] odd = new int[n];
        int[] even = new int[n];
        
        even[0]=A.get(0);
        
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                even[i]=even[i-1]+A.get(i);
                odd[i]=odd[i-1];
            }
            else
            {
                even[i]=even[i-1];
                odd[i]=odd[i-1]+A.get(i);
            }
        }
        
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));

        int cnt=0;
        
        for(int i=0;i<n;i++)
        {
            System.out.println(i);
            int oddSum = ((i==0)?0:odd[i-1]) + even[n-1] - even[i];
            int evenSum = ((i==0)?0:even[i-1]) + odd[n-1] - odd[i];
            System.out.println(oddSum+" - "+evenSum);
            if(oddSum==evenSum)
                cnt++;
        }
        
        return cnt;
    }
    
}
