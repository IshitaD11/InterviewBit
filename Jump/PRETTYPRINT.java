package InterviewBit.InterviewBit.Jump;

import java.util.ArrayList;

public class PRETTYPRINT {
    
    public static void main(String[] args) {
        int A = 5;
        PRETTYPRINT pp = new PRETTYPRINT();
        ArrayList<ArrayList<Integer>> ans = pp.prettyPrint(A);
        System.out.println(ans);
    }


    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        
        int size = 2*A-1;
        int left = 0;
        int right = size;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        
        // for first time entry , create the whole matrix with A  
        for(int i = left; i < right; i++){
            ans.add(new ArrayList<>());
            for(int j = left; j < right; j++){
                ans.get(i).add(A);
                }
        }
        
        // go to inner matrix and put A-1 in the whole place until A>0
        // keep increasing left and decreasing right pointer
        A--;
        right--;
        left++;
        
        while(A > 0){
        for(int i = left; i < right; i++){
            for(int j = left; j < right; j++){
                ans.get(i).set(j,A);
            }
        }
        
        A--;
        right--;
        left++;
        }

        return ans;
    }
}
