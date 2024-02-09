package InterviewBit.InterviewBit;

import java.util.ArrayList;

public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
        ArrayList<Interval> ans = new ArrayList<>();
        int sz = intervals.size();
        Interval merged = new Interval();
        boolean flag = false;
        
        for(int i=0;i<sz;i++)
        {
            // prev non overlapping
            if(intervals.get(i).end < newInterval.start)
            {
                ans.add(intervals.get(i));
            }

            else if(intervals.get(i).start > newInterval.end)
            {
                ans.add(newInterval);
                // remaining intervals would be non overlapping
                for(int j=i;j<sz;j++)
                    ans.add(intervals.get(j));
            }
            else
            {
                newInterval.start = Math.min(intervals.get(i).start,newInterval.start) ;
                newInterval.end = Math.max(intervals.get(i).end,newInterval.end) ;
            }
        }

        // if(flag)
        //     ans.add(newInterval);
        
        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++)
        {
            ans.get(i).display();
        }

        return ans;
    }
}