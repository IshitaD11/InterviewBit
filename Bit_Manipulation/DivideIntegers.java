package InterviewBit.InterviewBit.Bit_Manipulation;

public class DivideIntegers {
    public static void main(String[] args) {
        DivideIntegers d = new DivideIntegers();
        System.out.println(d.divide(37, 4));
    }

    public int divide(int divident, int divisor) {
        // without division, we can use subtraction. subtract divisor from divident until divident is less than divisor
        // and count the time loop goes. that is the quoteint.
        
        boolean isNegative=false;
        
        if(divident<0 && divisor>0  || divident>0 && divisor<0 )
        {
            isNegative=true;
        }

        long ldivident=Math.abs((long)divident);
        long ldivisor=Math.abs((long)divisor);
        long quo =0;
        
        while(ldivident>=ldivisor)
        {
            quo++;
            ldivident-=ldivisor;
        }

        quo = (isNegative==true?-quo:quo);
        return (quo>Integer.MAX_VALUE||quo<Integer.MIN_VALUE)?Integer.MAX_VALUE:(int)quo;
    }
}
