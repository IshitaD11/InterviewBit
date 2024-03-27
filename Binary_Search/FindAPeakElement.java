package InterviewBit.InterviewBit.Binary_Search;

import java.util.ArrayList;
import java.util.List;

public class FindAPeakElement {
    
    public static class Solution {

        public static int solve(ArrayList<Integer> A) {
            
            if(A.size()==1)
                return A.get(0);
                
            // edge cases
            if(A.get(0)>A.get(1)){
                return A.get(0);
            }
            
            if(A.get(A.size()-1)>A.get(A.size()-2))
                return A.get(A.size()-1);
                
            int st = 1;
            int en = A.size()-2;
            
            while(st<=en){
                int mid = st + (en-st)/2;
                
                if(A.get(mid)>A.get(mid-1) && A.get(mid)>A.get(mid+1))
                    return A.get(mid);
                else if(A.get(mid-1)>A.get(mid) && A.get(mid)>A.get(mid+1))
                    en = mid-1;
                else
                    st = mid+1;
            }
            
            return A.get(st);
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 17, 100, 11));
        System.out.println(Solution.solve(list));
    }

}
