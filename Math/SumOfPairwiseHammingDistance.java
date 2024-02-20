package InterviewBit.InterviewBit.Math;

import java.util.ArrayList;
import java.util.List;

public class SumOfPairwiseHammingDistance {
    
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(List.of(2, 4, 6));
        SumOfPairwiseHammingDistance s = new SumOfPairwiseHammingDistance();
        int ans = s.hammingDistance(A);
        System.out.println(ans);
    }

    public int hammingDistance(final List<Integer> A) {
        
        // check each bit position for all the elements of A, suppose in 0th bit there are x 0s and y 1s present. 
        // For a pair to contribute in Hamming distance, 1 should be having unset bit and 1 having set bit
        // for (x,y) count how many such pairs = 2*x*y (each unset bit to pair with set bit and vice versa)
        // sum all the bit positions and all the hamming distance
        
        int n=A.size();
        long sum = 0;
        long mod = 1000000007;
        
        for(int i=0;i<32;i++)
        {
            int cnt1=0;
            int cnt0=0;
            for(int num:A)
            {
                if(((num>>i)&1)==1)
                    cnt1++;
            }
            cnt0=n-cnt1;
            sum=(sum + (((2*cnt1)%mod)*cnt0)%mod)%mod;
        }
        return (int)sum;
    }
}
