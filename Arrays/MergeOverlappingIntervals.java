package InterviewBit.InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervals {
    
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));
        
        ArrayList<Interval> ans = merge(intervals);

        for(int i=0;i<ans.size();i++)
        {
            ans.get(i).display();
        }
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        
        // sort the array based on start then end
        Collections.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval a,Interval b)
            {
                if(a.start==b.start)
                    return a.end-b.end;
                return a.start-b.start;
            }    
        });
        
        ArrayList<Interval> ans = new ArrayList<>();
        
        Interval merged = intervals.get(0);
        
        for(int i=0;i<intervals.size();i++)
        {
            if(merged.end >= intervals.get(i).start)
            {
                merged.end = Math.max(merged.end,intervals.get(i).end);
            }
            else
            {
                ans.add(merged);
                merged = intervals.get(i);
            }
        }
        
        ans.add(merged);
        return ans;
    }
}
