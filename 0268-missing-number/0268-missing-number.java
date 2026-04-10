class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tsum=(n*(n+1)/2);
        int asum=0;
        for(int i=0;i<nums.length;i++){
            asum=asum+nums[i];
        }
        

        return tsum-asum;
    }
}