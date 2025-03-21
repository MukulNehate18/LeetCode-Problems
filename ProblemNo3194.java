import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        double[] a= new double[nums.length/2];
        int i=0;
        double average=(nums[0]+nums[nums.length-1])/2.0;
        while(i<nums.length/2){
            a[i]=(nums[i]+nums[nums.length-1-i])/2.0;
            if(average>a[i]){
                average=a[i];
            }
            i++;
        }
        return average;
    }
}
public class ProblemNo3194 {
    public static void main(String[] args) {
        Solution sc=new Solution();
        int[] nums={7, 8, 3, 4, 15, 13, 4, 1};
        sc.minimumAverage(nums);
    }
}
