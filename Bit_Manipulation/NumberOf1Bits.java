package InterviewBit.InterviewBit.Bit_Manipulation;

public class NumberOf1Bits {
    
    public static void main(String[] args) {
        Long A = 11L;
        NumberOf1Bits n = new NumberOf1Bits();
        System.out.println(n.numSetBits(A));
    }

    public int numSetBits(long a) {
        int cnt = 0;
        
        while(a>0){
            if((a&1)==1)
                cnt++;
            a=a>>1;
        }
        return cnt;
	}
}
