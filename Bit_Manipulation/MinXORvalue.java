package InterviewBit.InterviewBit.Bit_Manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinXORvalue {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(0, 4, 7, 9));
        MinXORvalue m = new MinXORvalue();
        System.out.println(m.findMinXor(list));
    }

    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int minXor = Integer.MAX_VALUE;

        for (int i = 0; i < A.size() - 1; i++) {
            int currentXor = A.get(i) ^ A.get(i+1);
            minXor = Math.min(minXor, currentXor);
        }

        return minXor;
    }
}
