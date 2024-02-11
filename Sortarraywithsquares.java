package InterviewBit.InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class Sortarraywithsquares {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(-6, -3, -1, 2, 4, 5));
        System.out.println(solve(list));
    }
    
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        // find where neg to pos transfer is happening in A
        // using two pointers go both ways and insert lower elements to the answer
        ArrayList<Integer> ans = new ArrayList<>();
        
        int midIdx = -1;
        
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)<=0)
                continue;
            else
            {    
                midIdx = i;
                break;
            }
        }
        int r = midIdx;
        int l = midIdx-1;
        
        while(r<A.size() && l>=0)
        {
            int rsqr=A.get(r)*A.get(r);
            int lsqr=A.get(l)*A.get(l);
            if(lsqr<rsqr)
            {
                ans.add(lsqr);
                l--;
            }
            else{
                ans.add(rsqr);
                r++;
            }
        }
        
        while(r<A.size())
        {
            int rsqr=A.get(r)*A.get(r);
            ans.add(rsqr);
            r++;
        }
        
        while(l>=0)
        {
            int lsqr=A.get(l)*A.get(l);
            ans.add(lsqr);
            l--;
        }
        return ans;
    }
}
