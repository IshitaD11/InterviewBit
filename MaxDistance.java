package InterviewBit.InterviewBit;

import java.util.List;

public class MaxDistance {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        
        // A prefix array to store the minimums. Then do binary search on the left for A[i] to get farthest minimums
        int[] min = new int[A.size()];
        min[0]=A.get(0);
        for(int i=1;i<A.size();i++)
        {
            min[i]=Math.min(min[i-1],A.get(i));
        }
        
        int maxDist = 0 ;
        
        for(int i=1;i<A.size();i++)
        {
            int st=0;
            int en=i;
            int leftIdx=i;
            
            while(st<=en)
            {
                int mid = st+(en-st)/2;
                // valid data, search more on left to get farthest
                if(min[mid]<=A.get(i))
                {
                    leftIdx=mid;
                    en=mid-1;
                }
                else
                    st=mid+1;
            }
            
            maxDist = Math.max(maxDist, (i-leftIdx));
        }
        return maxDist;
    }
}
