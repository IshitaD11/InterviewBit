package InterviewBit.InterviewBit.Math;

public class DivisibleBy60 {
    
    public static void main(String[] args) {
        DivisibleBy60 d = new DivisibleBy60();
        int[] A = {6,7,4,0,1};
        System.out.println(d.solveDivisibleBy60(A));
    }

    public int solveDivisibleBy60(int[] A) {
        // divisible by 10: 0 should exists
        // divisible by 2: even digit should exists
        // divisible by 3: sum of all digit, divisible by 3
        // all 3 of the above should satisfy to be divisible by 60
        
        if(A.length==1 && A[0]==0)
            return 1;
            
        boolean zero = false;
        boolean even = false;
        int sumOfDig = 0;
        
        for(int i=0;i<A.length;i++){
            if(A[i]==0)
                zero=true;
            else if(A[i]%2==0)
                even=true;
            sumOfDig+=A[i];
        }
        
        if(sumOfDig%3==0 && zero && even)
            return 1;
        return 0;
    }

}
