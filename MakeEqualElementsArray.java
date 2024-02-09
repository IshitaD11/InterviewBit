package InterviewBit.InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeEqualElementsArray {
    
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,3,1));
        int B = 2;
        System.out.println(solve(A,B));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        // need to have 3 sets of elements, 1 mid element, mid-B and mid+B element
        // sorting the array to check and count the diff of consecutive elements
        // diff should be B and count should only be 2 
        
        Collections.sort(A);
        
        int cnt = 0;
        
        for(int i=1;i<A.size();i++)
        {
            if(A.get(i)-A.get(i-1)==B)
                cnt++;
        }
        
        if(cnt==2)
            return 1;
        return 0;
    }
}

