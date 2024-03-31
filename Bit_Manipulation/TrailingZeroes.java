package InterviewBit.InterviewBit.Bit_Manipulation;

public class TrailingZeroes {
    
    
    public static void main(String[] args) {
        int A = 8;
        TrailingZeroes tz = new TrailingZeroes();
        System.out.println(tz.solve(A));
    }

    public int solve(int A) {
        int cnt = 0;
        
        while(A>0 && ((A&1)==0)){
            A=A>>1;
            cnt++;
        }
        
        return cnt;
    }
}
