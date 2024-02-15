package InterviewBit.InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>(List.of(0, 1));
        ArrayList<Integer> b = new ArrayList<>(List.of(1, 1));
        a.add(c);
        a.add(b);

        setZeroes(a);
        System.out.println(a);
    }

	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        // simple idea is use an array to store the row/col where 0 exists and update mat[row][col]=0
        // now we will use 0th row and 0th col, for storing. Also need to store if there is any 0 present in 0th row/col, so at the end 0th row & col to be updated accordingly
        
        boolean row0Exists = false;
        boolean col0Exists = false;
        
        int n = a.size();
        int m = a.get(0).size();
        
        for(int i=0;i<n;i++)
        {
            if(a.get(i).get(0)==0)
                col0Exists=true;
        }
        
        for(int j=0;j<m;j++)
        {
            if(a.get(0).get(j)==0)
                row0Exists=true;
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a.get(i).get(j)==0)
                {
                    a.get(0).set(j,0);
                    a.get(i).set(0,0);
                }
            }
        }
        
        System.out.println(a);

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a.get(i).get(0)==0 || a.get(0).get(j)==0)
                {
                    a.get(i).set(j,0);
                }
            }
        }
        
        System.out.println(a);

        if(row0Exists)
        {
            for(int j=0;j<m;j++)
            {
                a.get(0).set(j,0);
            }
        }
        
        if(col0Exists)
        {
            for(int i=0;i<n;i++)
            {   
                a.get(i).set(0,0);
            }
        }
	}

}
