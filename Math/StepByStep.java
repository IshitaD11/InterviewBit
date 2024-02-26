package InterviewBit.InterviewBit.Math;

public class StepByStep {

    public static void main(String[] args) {
        StepByStep s = new StepByStep();
        int ans = s.solve(5);
        System.out.println(ans);
    }
    
    public int solve(int A) {
        if (A == 0){
            return 0;
        }
        A = Math.abs(A);
        int target = 0;
        int steps = 1;
        
        
        while (target != A){
            if (target + steps == A){
                return steps;
            }
            
            if (target + steps > A){
                if ((target + steps - A)%2 == 0){
                    return steps;
                }
                else{
                    target+= steps;
                }
            }
            else{
                target+= steps;
            }
            steps++;
        }
        
        return -1;
    }    
}
