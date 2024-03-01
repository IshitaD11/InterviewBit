package InterviewBit.InterviewBit.Math;

public class FindNthFibonacci {
    
    // TC:O(logN)
    
    /* [[fn]    = [[fn-1 + fn-2]      = [[1  1] [[fn-1]   =  [[1  1] ^k * [[fn-k]    =  [[1  1] ^(n-1) * [[f1]   = [[1  1] ^ (n-1) * [[1]
        [fn-1]]    [fn-1 + 0*fn-2]]      [1  0]] [fn-2]]      [1  0]]     [fn-k-1]]      [1  0]]          [f0]]     [1  0]]           [0]]
    
    breaking fn-1 and fn-2 further till k where fn-k = f1 and fn-k-1=f0 ==> n-k=1 ==> k=n-1
    our goal is to find [1 1] ^ (n-1) ==> and answer will be at [0][0] pos
                        [1 0]
    */

    public static void main(String[] args) {
        FindNthFibonacci fn = new FindNthFibonacci();
        int A = 100;
        System.out.println(fn.solve(A));
    }
    
    long mod = 1000000000+7;
    public int solve(int A) {
        return (int)fib(A);
    }
    
    public long fib(int n) {
        long[][] F = {{1, 1}, {1, 0}};
        if (n == 0)
            return 0;
        power(F, n - 1);
        return F[0][0];
    }

    // power mod function to get a^n 
    void power(long[][] F, int n) {
        if ( n == 0 || n == 1)
            return;
        long[][] M = {{1, 1}, {1, 0}};
        power(F, n / 2);
        multiply(F, F);
        if (n % 2 != 0)
            multiply(F, M);
    }

    // matrix multiplication
    void multiply(long[][] F, long[][] M) {
        long a = ((F[0][0] * M[0][0])%mod + (F[0][1] * M[1][0])%mod)%mod;
        long b = ((F[0][0] * M[0][1])%mod + (F[0][1] * M[1][1])%mod)%mod;
        long c = ((F[1][0] * M[0][0])%mod + (F[1][1] * M[1][0])%mod)%mod;
        long d = ((F[1][0] * M[0][1])%mod + (F[1][1] * M[1][1])%mod)%mod;
        F[0][0] = a;
        F[0][1] = b;
        F[1][0] = c;
        F[1][1] = d;
    }
}
