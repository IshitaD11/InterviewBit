package InterviewBit.InterviewBit.Math;

import java.util.Arrays;

public class PrimeSum {
    public static void main(String[] args) {
        PrimeSum ps = new PrimeSum();
        int[] arr = ps.primesum(78);
        System.out.println(Arrays.toString(arr));
    }

    public int[] primesum(int A) {
     //find all prime numbers below A by SieveOfEratosthenes
        boolean[] isPrime = new boolean[A+1];
        Arrays.fill(isPrime,true);
        
        isPrime[0]=false;
        isPrime[1]=false;
        
        for(int num=2;num*num<=A;num++)
        {
            if(isPrime[num])
            {
                //mark all of num's multiple as false
                for(int i=num*num;i<A;i+=num)
                {
                    isPrime[i]=false;
                } 
            }
        }  
        
        //traverse array to find first pair
        for(int i=2;i<A;i++)
        {
            if(isPrime[i] && isPrime[A-i])
                return new int[]{i,(A-i)};
        }  
        
        return new int[]{0,0};
    }
}
