import java.util.Arrays;
import java.util.HashSet;

public class ProblemNo2465{
        public static int distinctAverages(int[] nums) {
            Arrays.sort(nums);
            HashSet<Double> distinct=new HashSet<>();
            int high=nums.length-1, low=0;
            while(low<high){
                double b=(nums[low] + nums[high])/2.0;
                distinct.add(b);
                high--;
                low++;
            }
            return distinct.size();
        }

    public static void main(String[] args) {
        int[] nums={1, 2, 4, 2,1 ,3 , 5,8};
        System.out.println(distinctAverages(nums));
    }
}
