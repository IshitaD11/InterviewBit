package InterviewBit.InterviewBit.Strings;

import java.util.HashMap;

public class BullsAndCows {
    public static void main(String[] args) {
        String secret = "87263757336", guess = "36532608069";
        BullsAndCows b = new BullsAndCows();
        System.out.println(b.solve(secret, guess));
    }

    public String solve(String A, String B) {
        HashMap<Character,Integer> map = new HashMap<>();
        int match = 0;
        int unmatch = 0;
        
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==B.charAt(i))    
                match++;
            else
                map.put(A.charAt(i),map.getOrDefault(A.charAt(i),0)+1);           
        }
        
        for(int i=0;i<B.length();i++){
            if(A.charAt(i)!=B.charAt(i) && map.containsKey(B.charAt(i)))
            {    
                unmatch++;
                map.put(B.charAt(i),map.get(B.charAt(i))-1);
                // System.out.println(B.charAt(i)+" "+map.get(B.charAt(i)));
                if(map.get(B.charAt(i)) == 0)
                    map.remove(B.charAt(i));
            }
        
        }
        
        return match+"A"+unmatch+"B";
    }
}
