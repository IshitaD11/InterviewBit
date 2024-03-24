package InterviewBit.InterviewBit.Binary_Search;

public class SquareRootOfInteger {
    public static void main(String[] args) {
        int A = 207645678;
        SquareRootOfInteger st = new SquareRootOfInteger();
        System.out.println(st.sqrt(A));
    }

    public int sqrt(int A) {
        if(A==0)
            return 0;
        long st = 1;
        long en = (long)A/2;
        
        int ans = 1;
        while(st<=en){
            long mid = st + (en-st)/2;
            
            if(mid*mid<=A){
                ans = (int)mid;
                st = mid+1;
            }
            else
                en = mid-1;
        }
        return ans;
    }
}
