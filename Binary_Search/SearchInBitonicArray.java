package InterviewBit.InterviewBit.Binary_Search;

public class SearchInBitonicArray {
    public static void main(String[] args) {
        int[] A = {3, 9, 10, 20, 17, 5, 1};
        int B = 20;
        SearchInBitonicArray sb = new SearchInBitonicArray();
        System.out.println(sb.solve(A, B));
    }
    public int solve(int[] A, int B) {
        if(A[0]==B)
            return 0;
        if(A[A.length-1]==B)
            return A.length-1;
            
        int st = 1;
        int en = A.length-1;
        int peak = -1;
        
        // find peak
        while(st<=en){
            int mid = st + (en-st)/2;
            
            if(A[mid-1]<A[mid] && A[mid]>A[mid+1]){
                peak=mid;
                break;
            }        
            else if(A[mid-1]<A[mid] && A[mid]<A[mid+1]){
                st=mid+1;
            }
            else
                en=mid-1;
        }
        
        if(B>A[peak])
            return -1;
        if(B==A[peak])
            return peak;
            
        // search in lower half
        st=0;
        en=peak-1;
        
        while(st<=en){
            int mid = st + (en-st)/2;
            
            if(A[mid]==B){
                return mid;
            }        
            else if(A[mid]<B){
                st=mid+1;
            }
            else
                en=mid-1;
        }
        
        st=peak+1;
        en=A.length-1;
        
        //search in upper half
        while(st<=en){
            int mid = st + (en-st)/2;
            
            if(A[mid]==B){
                return mid;
            }        
            else if(A[mid]>B){
                st=mid+1;
            }
            else
                en=mid-1;
        }
        
        return -1;
    }
}
