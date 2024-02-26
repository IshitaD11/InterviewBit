package InterviewBit.InterviewBit.Math;

public class NextSmallestPalindrome {
    
    public static void main(String[] args) {
        String str = new String("184963788291359953192887369481");
        NextSmallestPalindrome n = new NextSmallestPalindrome();
        System.out.println(n.solve(str));
    }

    public String solve(String A) {
        int n = A.length();
        StringBuilder sb = new StringBuilder();
        
        // case 1: if all digits are 999, next Palindrome is n+1 digits starts and ends with 1 and all 0s in between
        int cnt9 = 0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='9')
                cnt9++;
        }
        if(cnt9==n){
            sb.append('1');
            for(int i=1;i<(n);i++){
                sb.append('0');
            }
            sb.append('1');
            return sb.toString();
        }
        
        // for other numbers, 23511, divide the number by middle element to check for palindrome
        
        int mid = n/2;
        int left = mid-1;
        int right = (n%2==0)?mid:mid+1;

        System.out.println(mid);
        System.out.println(left);
        System.out.println(right);
        
        // case 2: if right side number is less than left side number just copy the left side to right side, keeping the centre intact
        // 2351511 --> 2351532
        
        // case 3: for numbers having right side larger than left side ('23545') or an number which is already palindrome '23532' 
        // need to increase the number from the mid element, and carry forward the carry
        // 23545 --> increase mid 5+1 to 6 --> 23632
        // 2319145 --> 2320232
        // 2351532 --> 2352532
        
        char[] num = A.toCharArray();
        
        // Initially, ignore the middle same digits
        while (left >= 0 && num[left] == num[right]) {
            left--;
            right++;
        }
        
        boolean leftHigher = false;
        // check for case 2: if not palindrome or left side is higher
        if(left>=0 && num[left] > num[right]){
            leftHigher = true;
        }
        
        // copy the right side as per left side
        while(left>=0){
            num[right] = num[left];
            left--;
            right++;
        }
        
        System.out.println(num);
        System.out.println(leftHigher);

        // return the value as per case 2
        if(leftHigher)
            return new String(num);
            
        // case 3: increase +1 from mid element
        // for odd element, incremnet the mid and carry
        int carry = 1;
        if(n%2==1){
            int inc = (int)(num[mid]-'0')+carry;
            num[mid] = (char)(inc%10+'0');
            carry = inc/10;
        }

        left = mid-1;
        right = (n%2==0)?mid:mid+1;

        System.out.println(left);
        System.out.println(right);
        
        while(left>=0 && carry>0){
            int inc = (int)(num[left]-'0')+carry;
            System.out.println("inc"+inc);
            num[left] = (char)(inc%10+'0');
            num[right] = num[left];
            System.out.println("left"+num[left] );
            carry = inc/10;
            left--;
            right++;
            // System.out.println(num);
        }
        
        return new String(num);
    }
}
