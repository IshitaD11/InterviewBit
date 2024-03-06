package InterviewBit.InterviewBit.Math;

import java.util.Arrays;

public class NextSimilarNumber {

    public static void main(String[] args) {
        String str = "210765";
        NextSimilarNumber nsn = new NextSimilarNumber();
        System.out.println(nsn.solve(str));
    }
    
    public String solve(String A) {
        char[] ch = A.toCharArray();
        int lowIdx = -1;
        
        // find the index where prev number is less
        for(int i=ch.length-2;i>=0;i--){
            if(ch[i]<ch[i+1]){
                lowIdx = i;
                break;
            }
        }
        
        if(lowIdx==-1)
            return "-1";
        
        int minAtRight = lowIdx+1;
        // find min higher number at the right of lowIdx
        for(int i=lowIdx+1;i<ch.length;i++){
            if(ch[i]>ch[lowIdx] && ch[i]<ch[minAtRight])
                minAtRight = i;
        }
        
        //swap those two number
        char temp = ch[lowIdx];
        ch[lowIdx] = ch[minAtRight];
        ch[minAtRight] = temp;
        
        // sort the remaining right side
        Arrays.sort(ch,lowIdx+1,ch.length);
        
        return String.valueOf(ch);
    }
}
