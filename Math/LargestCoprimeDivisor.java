package InterviewBit.InterviewBit.Math;

public class LargestCoprimeDivisor {
    
    public static void main(String[] args) {
        int A = 30;
        int B = 12;
        LargestCoprimeDivisor l = new LargestCoprimeDivisor();
        System.out.println(l.cpFact(A, B));
    }

    public int cpFact(int A, int B) {
        System.out.println(gcd(A, B));
        while (gcd(A, B) > 0) {
            A = A / gcd(A, B);
        }
        return A;
    }
    
    public int gcd(int a, int b)
    {
        // Everything divides 0
        if (b == 0)
            return a;
 
        // // base case
        // if (a == b)
        //     return a;
 
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        
        return gcd(min , max%min);
        
        // // a is greater
        // if (a > b)
        //     return gcd(a - b, b);
        // return gcd(a, b - a);
    }
}
