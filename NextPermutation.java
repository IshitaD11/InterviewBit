package InterviewBit.InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    
    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        ArrayList<Integer> A = new ArrayList<>(List.of(20, 113, 50, 455,87 ));
        System.out.println(np.nextPermutation(A));
    }

    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int n=A.size();
        
        // find the breakpoint a[i-1]>a[i]
        int idx = -1;
        for(int i=n-1;i>0;i--)
        {
            if(A.get(i-1)<A.get(i))
            {
                idx=i-1;
                break;
            }
        }
        
        // if idx = -1, then already sorted in reverse order, sort in increasing order
        if(idx==-1)
        {
            Collections.sort(A);
            return A;
        }
        
        // find the next greater element at the right side, swap it with A(idx)
        for(int i=n-1;i>idx;i--)
        {
            if(A.get(i)>A.get(idx))
            {
                int tmp = A.get(i);
                A.set(i,A.get(idx));
                A.set(idx,tmp);
                break;
            }
        }
        
        // reverse idx+1 to n-1
        int l=idx+1;
        int r=n-1;
        while(l<r)
        {
            int tmp = A.get(l);
            A.set(l,A.get(r));
            A.set(r,tmp);
            l++;
            r--;
        }
        
        return A;
    }
}
