package InterviewBit.InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Segregate0sAnd1sInAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(0,1,1,0,1,1,1,0,0,0,1,0));
        System.out.println(solve(list));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        // two pointer, left for 0, right for 1
        int idx0 = 0;
        int idx1 = n-1;
        
        // start from left, if not 0, then move the element to right side
        // otherwise increase idx0, as idx0 has 0, it is correct
        while(idx0<=idx1)
        {
            if(A.get(idx0)!=0)
            {
                swap(A,idx0,idx1);
                idx1--;
            }
            else
                idx0++;
        }
        return A;
    }
    public static void swap(ArrayList<Integer> A,int idx1,int idx2)
    {
        int temp=A.get(idx1);
        A.set(idx1,A.get(idx2));
        A.set(idx2,temp);
    }
}
