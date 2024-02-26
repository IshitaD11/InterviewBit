package InterviewBit.InterviewBit.Math;

public class ExcelColumnNumber {

    public static void main(String[] args) {
        ExcelColumnNumber e = new ExcelColumnNumber();
        int ans = e.titleToNumber("AB");
        System.out.println(ans);
    }
    
    public int titleToNumber(String A) {
        
        int x = 0;
        int p = 1;
        for (int i=A.length()-1; i>=0; i--) {
            x += (A.charAt(i) -'A'+1) * p;
            p *= 26;
        }
        return x;
    }
}
