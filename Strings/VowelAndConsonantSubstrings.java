package InterviewBit.InterviewBit.Strings;

public class VowelAndConsonantSubstrings {
    public static void main(String[] args) {
        String A = "aivvnjernowkejwngaw";
        VowelAndConsonantSubstrings v = new VowelAndConsonantSubstrings();
        System.out.println(v.solve(A));
    }   

    public int solve(String A) {
        // similar to finding "ag" in strings 
        // finding substring which starts with vowel and ends in consonant: count all vowels from the left,
        // whenever a consonant found, the vowelCnt vowels are there, so those many substring can be created
        // sum up the vowelCnt whenever consonant found
        // similarly for starting with consonant ending with vowel, serch from right to left
        long cnt = 0;
        long mod = 1000000007;
        
        long vowelCnt = 0;
        int idx = 0;
        
        // for vowel-cons
        while(idx<A.length()){
            char ch = A.charAt(idx);
            if(isVowel(ch)){
                vowelCnt++;
            }
            else
               cnt = (cnt+vowelCnt)%mod; 
            idx++;
        }
        
        // for cons-vowel
        idx = A.length()-1;
        vowelCnt = 0;
        while(idx>=0){
            char ch = A.charAt(idx);
            if(isVowel(ch)){
                vowelCnt++;
            }
            else
               cnt = (cnt+vowelCnt)%mod; 
            idx--;
        }
        
        return (int)cnt;
    }
    
    public boolean isVowel(char ch){
        
        switch(ch){
            case 'a': return true;
            case 'e': return true;
            case 'i': return true;
            case 'o': return true;
            case 'u': return true;
        }
        return false;
    }
}
