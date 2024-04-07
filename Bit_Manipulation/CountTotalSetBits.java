package InterviewBit.InterviewBit.Bit_Manipulation;

public class CountTotalSetBits {

    public static void main(String[] args) {
        int A = 18;
        CountTotalSetBits c = new CountTotalSetBits();
        System.out.println(c.solve(A));
    }

    public int solve(int A) {
        long cnt=0;
        int num=1;
        long mod=1000000007;
        A++;
        
        for(int i=0;i<30;i++){
            int x = A/num;
            x = x/2;
            x = x*num;
            if(((A>>i)&1)==1) 
                x=x+A%num;
            cnt=(cnt+x)%(mod);
            num=num*2;
        }
        return (int)cnt;
    }
}
