package InterviewBit.InterviewBit.Strings;

public class ImplementStrStr {
    public static void main(String[] args) {
        String A = "StrStr";
        String B = "Str";
        ImplementStrStr i = new ImplementStrStr();
        System.out.println(i.strStr(A, B));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        
        if(A.length()==0 || B.length()==0)
            return -1;
        
        for(int i=0;i<A.length();i++){
            if(B.charAt(0)==A.charAt(i)){
                for(int j=0;j<B.length() && (i+j)<A.length();j++){
                    if(B.charAt(j)!=A.charAt(i+j))
                        break;
                    if(j==B.length()-1 && B.charAt(j)==A.charAt(i+j))
                        return i;
                }
            }
        }
        
        return -1;
    }
}
