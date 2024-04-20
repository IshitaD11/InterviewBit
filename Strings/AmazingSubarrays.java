package InterviewBit.InterviewBit.Strings;

public class AmazingSubarrays {
    public static void main(String[] args) {
        String str = "ABEC";
        AmazingSubarrays a = new AmazingSubarrays();
        System.out.println(a.solve(str));
    }

    public int solve(String A) {
        int mod = 10003;
        int ans = 0;
        
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                ans = (ans+(A.length()-i))%mod;
            }
        }
        return ans;        
    }
}
