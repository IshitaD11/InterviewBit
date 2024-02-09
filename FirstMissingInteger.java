package InterviewBit.InterviewBit;

import java.util.ArrayList;

public class FirstMissingInteger {

    public int firstMissingPositive(ArrayList<Integer> A) {
        
        int n=A.size();
        int i=0;

        while(i<n)
        {
            if(A.get(i)>0 && A.get(i)<=n && A.get(i)!=(i+1))
            {
                int temp=A.get(A.get(i)-1);
                A.set(A.get(i)-1,A.get(i));
                A.set(i,temp);
            }
            else
                i++;
            System.out.println(A);
        }
        
        for(int x=0;x<n;x++)
        {
            if(A.get(x)!=(x+1))
                return x+1;
        }
        
        
        return 0;
    }
}
