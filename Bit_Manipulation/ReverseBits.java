package InterviewBit.InterviewBit.Bit_Manipulation;

public class ReverseBits {
    
    public static void main(String[] args) {
        Long a = 4294967295L;
        ReverseBits rb = new ReverseBits();
        System.out.println(rb.reverse(a));
    }

    public long reverse(long a) {
        long ans = 0;
        
        for(int i=0;i<31;i++){
            if(((a>>i)&1)==1)
            {    
                // System.out.println(i+"th bit: "+ ((a>>i)&1));
                ans = ans + 1;
            }
            
            ans = ans<<1;
        }

        // for the last bit no need to shift the ans
        if(((a>>31)&1)==1)
        {    
            // System.out.println(31+"th bit: "+ ((a>>31)&1));
            ans = ans + 1;
        }
        return ans;
	}
}
