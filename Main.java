package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        // HotelBookingsPossible hbp = new HotelBookingsPossible();
        // ArrayList<Integer> arrive = new ArrayList<>(List.of(2,3,4));
        // ArrayList<Integer> depart = new ArrayList<>(List.of(2, 6, 8));
        // boolean ans = hbp.hotel(arrive, depart, 2);
        // System.out.println(ans);

        // MaxDistance mdist = new MaxDistance();
        // ArrayList<Integer> list = new ArrayList<>(List.of(3, 5, 4, 2));
        // int ans = mdist.maximumGap(list);
        // System.out.println(ans);

        // int[] nums = {5,5,5,5,5};
        // int n=nums.length;
        
        // PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        // for(int i=0;i<n;i++)
        // {    
        //     max.add(nums[i]);
        // }
        
        // while(max.size()>0 && max.peek()!=0)
        // {
        //     int num1=max.poll();
            
        //     if(max.peek()==0)
        //     {
        //         max.add(0);
        //         break;
        //     }
            
        //     int num2=max.poll();
        //     System.out.println("num1:"+num1+"-num2:"+num2);
        //     int mod = num2%num1;
            
        //     System.out.println(mod+"mod");
            
        //     max.add(mod);
            
        //     System.out.println("maxsz"+max.size());
        // }
        // System.out.println(max.size());

        ArrayList<Integer> al = new ArrayList<>(List.of(1,2,0));
        FirstMissingInteger fmi = new FirstMissingInteger();
        int ans = fmi.firstMissingPositive(al);

        System.out.println(ans);;
    }
}
