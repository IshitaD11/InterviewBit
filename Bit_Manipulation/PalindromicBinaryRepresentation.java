package InterviewBit.InterviewBit.Bit_Manipulation;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromicBinaryRepresentation {
    
    public static void main(String[] args) {
        PalindromicBinaryRepresentation p = new PalindromicBinaryRepresentation();
        System.out.println(p.solve(20000));
    }

    // TC:O(A)
    public int solve(int A) {
        // stores the binary palindrome string
        Queue<String> q = new LinkedList<>();
 
        // base case
        if (A == 1)
            return 1;
            
        A = A - 1;
 
        // add 2nd binary palindrome string
        q.add("11");
 
        // runs till the nth binary palindrome number
        while (A > 0) {
            
            A--;
 
            // remove curr binary palindrome string from
            // queue
            String curr = q.remove();
 
            // if n==0 then we find the n'th binary
            // palindrome so we return our answer
            if (A == 0)
                return convertStringToInt(curr);
 
            // calculate length of curr binary palindrome
            // string
            int len = curr.length();
 
            // if length is even .so it is our first case
            // we have two choices
            if (len % 2 == 0) {
                q.add(curr.substring(0, len / 2) + "0"
                      + curr.substring(len / 2));
                q.add(curr.substring(0, len / 2) + "1"
                      + curr.substring(len / 2));
            }
 
            // if length is odd .so it is our second case
            // we have only one choice
            else {
                char midChar = curr.charAt(len / 2);
                q.add(curr.substring(0, len / 2) + midChar
                      + curr.substring(len / 2));
            }
        }
        return -1;
    }
    
    public int convertStringToInt(String s)
    {
        int ans = 0;
 
        // convert binary string into integer
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ans += (1 << i);
        }
        return ans;
    }
}
