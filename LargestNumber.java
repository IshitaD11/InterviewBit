package InterviewBit.InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

    public static void main(String[] args) {
        // List<Integer> A = new ArrayList<>(List.of(3, 30, 34, 5, 9));
        // List<Integer> A = new ArrayList<>(List.of(0,0,0,0,0));
        List<Integer> A = new ArrayList<>(List.of(0,0,9,5,30,3));
        String ans = largestNumber(A);
        System.out.println(ans);
    }

    public static String largestNumber(final List<Integer> A) {
        ArrayList<String> str = new ArrayList<>();
        
        for(int i=0;i<A.size();i++)
        {
            str.add(String.valueOf(A.get(i)));
        }
        
        Collections.sort(str,new Comparator<String>(){
            @Override
            public int compare(String a,String b)
            {
                String x=a+b;
                String y=b+a;
                return y.compareTo(x);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<str.size() && str.get(i).equals("0"))
        {   
            i++;
            continue;
        }
            
        for( ;i<str.size();i++)
        {
            sb.append(str.get(i));
        }
        
        if(sb.length()==0)
            return "0";
            
        return sb.toString();
    }
}
