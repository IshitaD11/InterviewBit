package InterviewBit.InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class RotateMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(List.of(1, 2,3)));
        a.add(new ArrayList<>(List.of(4, 5,6)));
        rotate(a);
        System.out.println(a);
    }
    public static void rotate(ArrayList<ArrayList<Integer>> a) {
        
        int n=a.size();
        int m=a.get(0).size();
        
        // transpose matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp = a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,temp);
            }
        }
        
        // System.out.println(a);
        
        // swap elements of each row by the centre
        for(int i=0;i<n;i++)
        {
            int l=0;
            int r=m-1;
            while(l<r)
            {
                int temp = a.get(i).get(l);
                a.get(i).set(l,a.get(i).get(r));
                a.get(i).set(r,temp);
                l++;
                r--;
            }
        }
	}
}
