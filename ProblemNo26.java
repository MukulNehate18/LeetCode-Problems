public class ProblemNo26 {
        public static int removeDuplicates(int[] nums) {
            if(nums.length ==0){
                return 0;
            }
            int slow=0;
            for(int i=1;i<nums.length;i++){
                if(nums[slow]!=nums[i]){
                    slow++;
                    nums[slow]= nums[i];
                }
            }
            return slow+1;
        }

    public static void main(String[] args) {
        int[] num ={};
        int a=removeDuplicates(num);
        System.out.println(a);
    }
}
