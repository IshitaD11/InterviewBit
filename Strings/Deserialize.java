package InterviewBit.InterviewBit.Strings;

import java.util.ArrayList;

public class Deserialize {
    public static void main(String[] args) {
        Deserialize d = new Deserialize();
        System.out.println(d.deserialize("scaler6~academy7~"));
    }

    public ArrayList<String> deserialize(String A) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)>='a' && A.charAt(i)<='z')
                sb.append(A.charAt(i));
            else if(A.charAt(i)=='~'){
                ans.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return ans;
    }
}
