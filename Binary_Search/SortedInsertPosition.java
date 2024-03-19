package InterviewBit.InterviewBit.Binary_Search;

import java.util.ArrayList;
import java.util.List;

public class SortedInsertPosition {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 3, 5, 6));
        int B = 7;
        SortedInsertPosition s = new SortedInsertPosition();
        System.out.println(s.searchInsert(A, B));
    }

    public int searchInsert(ArrayList<Integer> a, int b) {
        // need to find the equal or just upper index
        int st = 0;
        int en = a.size()-1;
        int ansIdx = -1;
        
        if(a.get(en)<b)
            return a.size();
        
        while(st<=en){
            int mid = st+(en-st)/2;
            
            if(a.get(mid)==b)
                return mid;
            else if(a.get(mid)>b){
                ansIdx = mid;
                en=mid-1;
            }
            else
                st=mid+1;
        }
        return ansIdx;
	}
}
