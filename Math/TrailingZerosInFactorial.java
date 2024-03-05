package InterviewBit.InterviewBit.Math;

public class TrailingZerosInFactorial {

    public static void main(String[] args) {
        int A = 2547;
        TrailingZerosInFactorial t = new TrailingZerosInFactorial();
        System.out.println(t.trailingZeroes(A));
    }
    
    // zeros will occur for 5*(even nos) 
    // divide number by 5, and keep adding to answer

    public int trailingZeroes(int A) {
        int countOf5 = 0;
        while(A>0){
            countOf5+=(A/5);
            A=A/5;
        }
        return countOf5;
    }

}
