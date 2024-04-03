package InterviewBit.InterviewBit.Bit_Manipulation;

public class PalindromeString {
    
    public static void main(String[] args) {
        String A = "A man, a plan, a canal: Panama";
        PalindromeString p = new PalindromeString();
        System.out.println(p.isPalindrome(A));
    }

    public int isPalindrome(String A) {
        
        String lower = A.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        int left = 0;
        int right = lower.length()-1;
        
        // System.out.println(lower);
        
        while(left<=right){
            if(lower.charAt(left)!=lower.charAt(right))
                return 0;
            
            else{
                left++;
                right--;
            }
            
        }
        return 1;
    }
}
