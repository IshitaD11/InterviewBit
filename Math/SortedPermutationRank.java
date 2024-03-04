package InterviewBit.InterviewBit.Math;

public class SortedPermutationRank {

    // For each char, find the chars lower in the right hand side. "bca" for A[0]='b', 'a' is a lower number. 
    // If I place A[0]='a' then remaining b and c will permute, (n-1)! / (n-i-1)!
    // If there are multiple chars lower than A[0], then permute that many times count*(n-i-1)!
    
    public static void main(String[] args) {
        String str = "ubac";
        SortedPermutationRank s = new SortedPermutationRank();
        System.out.println(s.findRank(str));
    }

    int mod = 1000003;
    public int findRank(String A) {
        int ans = 0;
        int n=A.length();
        
        for(int i=0;i<n;i++){
            int higherChar = 0;
            for(int j=i+1;j<n;j++){
                if(A.charAt(j)<A.charAt(i))
                    higherChar++;
            }
            
            ans = (ans + (fact(n-i-1) * higherChar)%mod)%mod;
        }
        return ans+1;
    }
    
    public int fact(int n){
        if(n<=1)
            return 1;
        return (n*fact(n-1))%mod;
    }
}
