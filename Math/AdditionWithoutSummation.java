package InterviewBit.InterviewBit.Math;

public class AdditionWithoutSummation {

    public static void main(String[] args) {
        int A = 3;
        int B = 10;
        AdditionWithoutSummation as = new AdditionWithoutSummation();
        System.out.println(as.addNumbers(A, B));
    }
    
    public int addNumbers(int A, int B) {
        // when both number's ith bit is not set,then A^B is the same as A+B
        // when both number's ith bit is set, then A&B gives those bit positions, as these will be carries to next bit
        // shift carry<<1 and again add the same to the A^B already taken.
        
        while(B>0){
            int carry = (A & B);
            A = (A ^ B);
            B = carry<<1;
        }
        return A;
    }
}
