package InterviewBit.InterviewBit.Binary_Search;

public class ImplementPowerFunction {
    
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int d = 3;
        ImplementPowerFunction pow = new ImplementPowerFunction();
        System.out.println(pow.pow(x, n, d));
    }

    // TC: O(log(base2)n)
    public int pow(int x, int n, int d) {
        if(x==0)
            return 0;
        return (int)powMod(x,n,(long)d);
    }
    public long powMod(int x, int n, long d) 
    {
        if(n==0)
            return 1L;
        
        long num = powMod(x,(n/2),d);
        
        if(num<0)
            num=(num+d)%d;
            
        long xL = (long)x;
        if(x<0)
            xL=(xL+d)%d;
            
            
        if(n%2==0){
            return (num*num)%d;
        }
        else
            return (xL*((num*num)%d))%d;
    }    
}
