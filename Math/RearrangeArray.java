package InterviewBit.InterviewBit.Math;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(4, 0, 2, 1, 3));
        RearrangeArray ra = new RearrangeArray();
        ra.arrange(list);
        System.out.println(list);
    }
    public void arrange(ArrayList<Integer> a) {
        // lets say a and b are two numbers need to swap: temp = a+(b%n)*n 
        // b = temp/n  (as a is 0 to n-1)
        // a = temp%n 
        int n = a.size();
        for(int i=0;i<a.size();i++){
            int temp = a.get(i) + (a.get(a.get(i))%n)*(n);
            a.set(i,temp);
        }
        
        for(int i=0;i<a.size();i++){
            a.set(i,a.get(i)/(n));
        }
        
	}
}
