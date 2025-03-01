public class ProblemNo2460 {
        public static int[] applyOperations(int[] nums) {
            int slow=0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    nums[i] *= 2;
                    nums[i+1]=0;
                }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    int temp=nums[i];
                    nums[i]=nums[slow];
                    nums[slow]=temp;
                    slow++;
                }
            }
            return nums;
        }

    public static void main(String[] args) {
        int[] nums={0, 1, 0, 3,12, 0};
        applyOperations(nums);
    }
}
