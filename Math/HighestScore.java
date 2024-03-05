package InterviewBit.InterviewBit.Math;

import java.util.HashMap;

public class HighestScore {
    public static void main(String[] args) {
        String[][] A = {{"Bob", "80"}, {"Bob", "90"}, {"Alice", "90"}, {"Alice", "10"}};
        HighestScore hs = new HighestScore();
        System.out.println(hs.highestScore(A));
    }

    public int highestScore(String[][] A) {
        HashMap<String,Integer> cnt = new HashMap<>();
        HashMap<String,Integer> score = new HashMap<>();
        
        for(int i=0;i<A.length;i++){
            String stu = A[i][0];
            int scr = Integer.valueOf(A[i][1]);
            cnt.put(stu, cnt.getOrDefault(stu,0)+1);
            score.put(stu, score.getOrDefault(stu,0)+scr);
        }
        
        int max=0;
        for(String str:cnt.keySet()){
            int avg = (int)Math.floor(score.get(str)*(1.0)/cnt.get(str));
            max = Math.max(avg,max);
        }
        return max;
    }
}
