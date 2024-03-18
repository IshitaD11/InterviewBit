package InterviewBit.InterviewBit.Binary_Search;

public class MatrixSearch {
    
    public static void main(String[] args) {
        int[][] A = {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50} } ;
        int B = 3;
        MatrixSearch ms = new MatrixSearch();
        System.out.println(ms.searchMatrix(A, B));
    }

    public int searchMatrix(int[][] A, int B) {
        int n=A.length;
        int m=A[0].length;
        
        // search for the row
        int st = 0;
        int en = n-1;
        int row = -1;
        
        while(st<=en){
            int mid = st + (en-st)/2;
            
            if(A[mid][0]==B)
                return 1;
            else if(A[mid][0]<B){
                row = mid;
                st=mid+1;
            }
            else   
                en=mid-1;
        }
        
        if(row==-1)
            return 0;
            
        // find in "row"
        st = 0;
        en = m-1;
        
        while(st<=en){
            int mid = st + (en-st)/2;
            
            if(A[row][mid]==B)
                return 1;
            else if(A[row][mid]<B){
                st=mid+1;
            }
            else   
                en=mid-1;
        }
        
        return 0;
    }
}
