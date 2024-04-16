package InterviewBit.InterviewBit.Math;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;

public class KthPermutation {
    
    public static void main(String[] args) {
        int n = 100000;
        Long k = 603828039791327040L;
        KthPermutation kPer = new KthPermutation();
        System.out.println(kPer.findPerm(n, k));
    }

    public ArrayList<Integer> findPerm(int A, Long B) {
        TreeSet<Integer> st = new TreeSet<>();
        for (int i = 1; i <= A; i++) {
            st.add(i);
        }
        Iterator<Integer> it = st.iterator();
        int t = 0;

        int a = A;
        ArrayList<Integer> ans = new ArrayList<>(A);

        for(int i=0;i<A;i++)
            ans.add(1);

        long factorial = 1;
        for (long j = 1; j <= Math.min(A, 20); j++) {
            factorial = factorial * j;
        }
        int index = 0;
        int i = 0;
        while (index <= A - 1) {
            if (A - i <= 20) {
                factorial = factorial / (A - i);
            }
            long order = B / factorial;
            if (B % factorial == 0) {
                int length = 1;
                Iterator<Integer> it1 = st.iterator();
                while (it1.hasNext()) {
                    ans.set(A - length, it1.next());
                    length++;
                    index++;
                }
                return ans;
            } else {
                order += 1;
                it = st.iterator();
                for (int k = 0; k < order - 1; k++) {
                    it.next();
                }
                ans.set(index, it.next());
                index++;
                it.remove();
            }
            i++;
            B = B % factorial;
        }
        return ans;
    }
}
