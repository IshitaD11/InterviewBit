package InterviewBit.InterviewBit.Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class DifferentBitsSumPairwise{
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 5));
        DifferentBitsSumPairwise d = new DifferentBitsSumPairwise();
        System.out.println(d.cntBits(list));
    }

    public int cntBits(ArrayList<Integer> A) {
        // for ith bit position if list A has x set bits and (len(A)-x) unset bits, then pair of different bits = x*(n-x) 
        // tc:O(n)
        
        long total = 0;
        int n = A.size();
        long mod = 1000000007;
   
        for (int j=0;j<32;j++) {
            
            long setBitCount = 0;
            
            for (int i=0;i<n;i++)
                setBitCount += (A.get(i) >> j) & 1;
                
            total = ( total + (setBitCount * (n - setBitCount)) % mod ) % mod ;
        
        }
        
        // total*2 as f(2,3) and f(3,2) are considered seperately in sum
        total = (total*2) % (1000000007);
        return (int)total;

    }
}