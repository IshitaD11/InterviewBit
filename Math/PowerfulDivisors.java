package InterviewBit.InterviewBit.Math;

import java.util.Arrays;

public class PowerfulDivisors {
    
    public static void main(String[] args) {
        int[] A = {5,10};
        PowerfulDivisors pd = new PowerfulDivisors();
        int[] ans = pd.powerfulDivisors(A) ;
        System.out.println(Arrays.toString(ans));
    }

    public int[] powerfulDivisors(int[] A) {

        // similar to sieve of eratosthenes, find out the count of divisors of i in div[i]
        int max = 0;
        for(int i=0;i<A.length;i++)
            max = Math.max(max,A[i]);
            
        int[] div = new int[max+1];
        
        // for each number, add count to it's multiples, until max
        for (int i = 1; i < div.length; i++) {
            for (int j = i; j < div.length; j += i) {
                div[j]++;
            }
        }
        
        int[] ans = new int[A.length];
        
        // for each element in A, check 1 to A[i], how many numbers has divisor count in power of 2
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j <= A[i]; j++) {
                // to identify div[j] is power of 2, (010 & 001) == 0
                if ((div[j] & (div[j]-1)) == 0) 
                    ans[i]++;
            }
        }
        return ans;
    }
}
