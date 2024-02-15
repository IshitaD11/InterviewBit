package InterviewBit.InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingsPossible {
    
    // public static void main(String[] args) {
    //     HotelBookingsPossible hbp = new HotelBookingsPossible();
        // ArrayList<Integer> arrive = new ArrayList<>(List.of(2,3,4));
        // ArrayList<Integer> depart = new ArrayList<>(List.of(2, 6, 8));
        // boolean ans = hbp.hotel(arrive, depart, 2);
        // System.out.println(ans);
    // }
    
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        // need to get at a time there is not bookings more than k
        Collections.sort(arrive);
        Collections.sort(depart);
        
        int n = arrive.size();
        
        // consider 1 room is there
        int currBookingCount = 1;
        // int maxBookingCount = 1;
        
        // arriveIdx 0 is already in room 1
        int arriveIdx = 1;
        int departIdx = 0;
        
        while (arriveIdx < n && departIdx < n) 
        {
            if (arrive.get(arriveIdx) <= depart.get(departIdx)) {
                currBookingCount++;
                // maxBookingCount = Math.max(maxBookingCount, currBookingCount);
                arriveIdx++;
            }
            else {
                currBookingCount--;
                departIdx++;
            }
            
            if (currBookingCount > K) {
                return false;
            }
        }
        return true;
    }
    
}
