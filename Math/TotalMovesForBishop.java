package InterviewBit.InterviewBit.Math;

public class TotalMovesForBishop {
    
    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        TotalMovesForBishop t = new TotalMovesForBishop();
        int ans = t.solve(A,B);
        System.out.println(ans);
    }

    public int solve(int A, int B) {
        
        // Count top left squares
        int topLeft = Math.min(A, B) - 1;
 
        // Count bottom right squares
        int bottomRight = 8 - Math.max(A, B);
 
        // Count top right squares
        int topRight = Math.min(A, 9 - B) - 1;
 
        // Count bottom left squares
        int bottomLeft = 8 - Math.max(A, 9 - B);
 
        // Return total count
        return (topLeft + topRight + bottomRight + bottomLeft);
    }
}
