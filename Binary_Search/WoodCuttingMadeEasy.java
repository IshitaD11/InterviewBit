package InterviewBit.InterviewBit.Binary_Search;

public class WoodCuttingMadeEasy {
    public static void main(String[] args) {
        int[] A = {4, 42, 40, 26, 46};
        int B = 20;
        WoodCuttingMadeEasy wcm = new WoodCuttingMadeEasy();
        System.out.println(wcm.solve(A, B));
    }
    public int solve(int[] A, int B) {
        // possible heights of the wood cutting machine: 0 to max(A[i]) 
        // need to find the upper bound of cutting, where B wood is collected
        // do binary search from 0 to max(A[i]). check if we place machine at mid height, B woods collected or not.
        // if collected, try to increase the height, so that lowest amount of wood is cut off
        
        int max = A[0];
        for(int i=0;i<A.length;i++){
            max=Math.max(A[i],max);
        }
        
        int st = 0;
        int en = max;
        int ans = 0;
        
        while(st<=en){
            int mid = st + (en-st)/2;
            
            if(isValidAns(A,mid,B)){
                ans = mid;
                st = mid+1;
            }
            else
                en = mid-1;
        }
        
        return ans;
    }
    
    public boolean isValidAns(int[] A,int mid,int B)
    {
        int woodCut = 0;
        
        for(int i=0;i<A.length;i++){
            woodCut += Math.max(0,A[i]-mid);
            if(woodCut>=B)
                return true;
        }
        return false;
    }
}
