public class ProblemNo11 {
        public static int maxArea(int[] height) {
            int max=0, lp=0, rp=height.length-1;
            if(height.length <=1){
                return 0;
            }
            while(lp<rp){
                int result=(rp-lp)*(Math.min(height[rp], height[lp]));
                max=Math.max(max, result);
                if(height[lp]<height[rp]){
                    lp++;
                }else{
                    rp--;
                }
            }
            return max;
        }

    public static void main(String[] args) {
            int[] height={1,8,6,2,5,4,8,3,7};
        int a=maxArea(height);
        System.out.println(a);
    }
}
