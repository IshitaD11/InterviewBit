package InterviewBit.InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PerfectPeakOfArray {
    public int perfectPeak(ArrayList<Integer> A) {
        // A[i] is the resultant element if it is max from 0 to i elements & min from i to n-1 elements.
        // prefix and suffix array to store max from 0 to i & min from n-1 to i
        
        int n=A.size();
        int[] preMax = new int[n];
        int[] sufMin = new int[n];
        
        preMax[0]=A.get(0);
        sufMin[n-1]=A.get(n-1);
        
        for(int i=1;i<n;i++)
        {
            preMax[i] = Math.max(A.get(i),preMax[i-1]);
        }
        
        for(int i=n-2;i>=0;i--)
        {
            sufMin[i] = Math.min(sufMin[i+1],A.get(i));
        }
        
        System.out.println(Arrays.toString(preMax));
        System.out.println(Arrays.toString(sufMin));

        for(int i=1;i<n-1;i++)
        {
            if(preMax[i]==sufMin[i] && preMax[i]!=preMax[i-1] && sufMin[i]!=sufMin[i+1])
                return 1;
        }
        
        return 0;
    }
}
