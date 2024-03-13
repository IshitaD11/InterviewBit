package InterviewBit.InterviewBit.Binary_Search;

public class SmallerOrEqualElements {

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 4, 6};
        int B = 4;
        SmallerOrEqualElements s = new SmallerOrEqualElements();
        System.out.println(s.solve(A, B));
    }

    public int solve(int[] A, int B) {
        int st=0;
        int en=A.length-1;
        int upperIdx = -1;
        
        while(st<=en){
            int mid = st + (en-st)/2;
            
            if(A[mid]<=B){
                upperIdx = mid;
                st=mid+1;
            }
            else
                en=mid-1;
        }
        
        return upperIdx+1;
    }
    
}
