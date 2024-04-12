package InterviewBit.InterviewBit.Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class XORingtheSubarrays {
    
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4, 5, 7, 5));
        XORingtheSubarrays x = new XORingtheSubarrays();
        System.out.println(x.solve(A));
    }

    public int solve(ArrayList<Integer> A) {
        // identify each number's occurance in all subarrays
        // (i+1)*(n-i) times --> if this is even, then do not consider A[i], as x^x = 0
        // if it is odd, then consider once in ans
        
        int xorAns = 0;
        int sz = A.size();
        
        for(int i=0;i<sz;i++){
            int occr = (i+1)*(sz-i);
            
            if(occr%2!=0)
                xorAns^=A.get(i);
        }
        
        return xorAns;
    }
}
