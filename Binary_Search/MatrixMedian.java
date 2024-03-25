package InterviewBit.InterviewBit.Binary_Search;

import java.util.ArrayList;
import java.util.List;

public class MatrixMedian {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>(List.of(new ArrayList<>(List.of(1, 3, 5)),
        new ArrayList<>(List.of(2, 6, 9)), 
        new ArrayList<>(List.of(3, 6, 9))));
        MatrixMedian mm = new MatrixMedian();
        System.out.println(mm.findMedian(A));
    }
    
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        
        int n = A.size();
        int m = A.get(0).size();
        
        // median is (n*m/2)+1 th element given n*m is odd
        int targetPos = ((n*m)/2)+1;
        
        // find min as min of all 0th col element of all rows  
        // find max as max of all (m-1)th col element of all rows
        int min = A.get(0).get(0);
        int max = A.get(0).get(m-1);
        
        for(int i=0;i<n;i++){
            min = Math.min(min,A.get(i).get(0));
            max = Math.max(max,A.get(i).get(m-1));
        }
        int ans = 0;
        
        // binary search between min and max to get the median element
        while(min<=max){
            int mid = min + (max-min)/2;
            
            // higher is also a valid answer as we are getting the upper bound position
            if(posOfMidInSortedArr(A,mid,n,m)>=targetPos){
                ans = mid;
                max = mid-1;
            }
            else
                min = mid+1;
        }
        
        return ans;
    }
    
    public int posOfMidInSortedArr(ArrayList<ArrayList<Integer>> mat, int ele, int row, int col){
        // do binary search on each row and get upper bound from each row and sum up
        // aim is to find position of median 
        
        int posCnt = 0;
        int upperBoundIdx=0;
        
        // find upper bound of ele in each row
        for(int i=0;i<row;i++)
        {
            int low=0;
            int high=col-1;
            upperBoundIdx=col;
            while(low<=high)
            {
                int mid = low +(high-low)/2;
                if(mat.get(i).get(mid)>ele)
                {
                    upperBoundIdx=mid;
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            posCnt = posCnt+upperBoundIdx;
        }
        return posCnt;        
    }
}
