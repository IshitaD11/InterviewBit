package InterviewBit.InterviewBit.Bit_Manipulation;

import java.util.List;

public class SingleNumberII {

    public static void main(String[] args) {
        
        List<Integer> A = List.of(1, 2, 4, 3, 3, 2, 2, 3, 1, 1);
        SingleNumberII s = new SingleNumberII();
        System.out.println(s.singleNumber(A));
    }

    public int singleNumber(final List<Integer> A) {
        // count the set bits for every ith position, do count%3. 
        // if it is 1, then the single number should have 1 in ith bit
        
        int ans = 0;
        
        for(int i=0;i<31;i++){
            int bitCnt = 0;
            for(int num:A){
                
                if (((num>>i)&1)==1)
                    bitCnt++;
            }
            
            if(bitCnt%3!=0)
                ans += (1<<i);
        }
        
        return ans;
    }
    
}
