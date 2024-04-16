package InterviewBit.InterviewBit.Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersOfLengthNAndValueLessThanK {
    
    public static void main(String[] args) {
        NumbersOfLengthNAndValueLessThanK n = new NumbersOfLengthNAndValueLessThanK();
        ArrayList<Integer> A = new ArrayList<>(List.of(0, 1, 2, 5));
        int B = 2;
        int C = 21;
        System.out.println(n.solve(A, B, C));
    }

    public int solve(ArrayList<Integer> A, int B, int C) {
        
        ArrayList<Integer> digit = new ArrayList<Integer>();
        int d, d2;
    
        // Convert number to digit array
        digit = numToList(C);
        d = A.size();
    
        // Case 1: No such number possible as the
        // generated numbers will always
        // be greater than C
        if (B > digit.size() || d == 0)
            return 0;
    
        // Case 2: All integers of length B are valid
        // as they all are less than C
        else if (B < digit.size()) 
        {
            // contain 0
            // A[] contains 0, the first place can be filled in (d – 1) ways. 
            // Since repetition is allowed and 0 can occupy the other places, 
            // rest N – 1 places can be filled in d * d * … * d(N – 1) times i.e. in dN – 1 ways
            if (A.get(0) == 0 && B != 1)
                return (int) ((d - 1) * Math.pow(d, B - 1));
            else
                // otherwise all B positions can be filled bt all d digits 
                return (int) Math.pow(d, B);
        }
    
        // Case 3: B is equal to digits.size()
        else
        {
            int []dp = new int[B + 1];
            
            // lower[i] denote the number of elements in A[] which are smaller than i. 
            int []lower = new int[10 + 1];
    
            // Update the lower[] array such that
            // lower[i] stores the count of elements
            // in A[] which are less than i
            // store the elements of A and using prefix sum find the elements lower for each i.
            for (int i = 0; i < d; i++)
                lower[A.get(i) + 1] = 1;
            for (int i = 1; i <= 10; i++)
                lower[i] = lower[i - 1] + lower[i];
    
            boolean flag = true;
            dp[0] = 0;
            for (int i = 1; i <= B; i++) 
            {
                d2 = lower[digit.get(i - 1)];
                dp[i] = dp[i - 1] * d;
    
                // For first index we can't use 0
                if (i == 1 && A.get(0) == 0 && B != 1)
                    d2 = d2 - 1;
    
                // Whether (i-1) digit of generated number
                // can be equal to (i - 1) digit of C
                if (flag)
                    dp[i] += d2;
    
                // Is digit[i - 1] present in A ?
                flag = (flag & (lower[digit.get(i - 1) + 1] == lower[digit.get(i - 1)] + 1));
            }
            return dp[B];
        }
    }
    
    public ArrayList<Integer> numToList(int N)
    {
        ArrayList<Integer> digit = new ArrayList<Integer>();
    
        // Push all the digits of N from the end
        // one by one to the vector
        while (N != 0)
        {
            digit.add(N % 10);
            N = N / 10;
        }
    
        // If the original number was 0
        if (digit.size() == 0)
            digit.add(0);
    
        // Reverse the vector elements
        Collections.reverse(digit);
    
        // Return the required vector
        return digit;
    } 
}
