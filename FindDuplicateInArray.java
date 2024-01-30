package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(List.of(3, 4, 1, 4, 2));
        int ans = repeatedNumber(A);
        System.out.println(ans);
    }
    
    public static int repeatedNumber(final List<Integer> A) {
        int slow = A.get(0);
        int fast = A.get(A.get(0));
        
        while(slow!=fast)
        {
            slow = A.get(slow);
            fast = A.get(A.get(fast));
        }
        
        fast=0;
        while(slow!=fast)
        {
            slow=A.get(slow);
            fast=A.get(fast);
        }
        
        if(slow==0)
            return -1;
            
        return slow;
    }
}
