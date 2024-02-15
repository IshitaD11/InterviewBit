package InterviewBit.InterviewBit.Arrays;

public class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }

    void display()
    {
        System.out.println("["+this.start+","+this.end+"]");
    }
}
