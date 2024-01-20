package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // HotelBookingsPossible hbp = new HotelBookingsPossible();
        // ArrayList<Integer> arrive = new ArrayList<>(List.of(2,3,4));
        // ArrayList<Integer> depart = new ArrayList<>(List.of(2, 6, 8));
        // boolean ans = hbp.hotel(arrive, depart, 2);
        // System.out.println(ans);

        MaxDistance mdist = new MaxDistance();
        ArrayList<Integer> list = new ArrayList<>(List.of(3, 5, 4, 2));
        int ans = mdist.maximumGap(list);
        System.out.println(ans);
    }
}
