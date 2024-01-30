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
        // using slow and fast pointer method, try to find out the source of cycle/common element.
        // slow moves 1 step a time, fast pointer moves 2 step a time, until both matches, if not matches, then duplicate is not there
        // initialize fast=0, again move slow and fast 1 step a time, the point it is equal is the common element

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
