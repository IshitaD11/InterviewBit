package InterviewBit.InterviewBit.Strings;

public class RemoveConsecutiveCharacters {
    
    public static void main(String[] args) {
        String str = "aaaabbbccd";
        int n = 2;
        RemoveConsecutiveCharacters r = new RemoveConsecutiveCharacters();
        System.out.println(r.solve(str, n));
    }

    public String solve(String A, int B) {
        
        StringBuilder sb = new StringBuilder();
        char ch = A.charAt(0);
        int charCnt = 1;
        
        for(int i=1;i<A.length();i++){
            if(A.charAt(i)==ch){
                charCnt++;
            }
            else{
                if(charCnt!=B){
                    for(int j=0;j<charCnt;j++){
                        sb.append(ch);
                    }
                }
                
                charCnt = 1;
                ch=A.charAt(i);
            }
            
        }
        
        // for the last set of chars
        if(charCnt!=B){
            for(int j=0;j<charCnt;j++){
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}
