class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        int case1=roblinear(nums,0,n-2);
        int case2=roblinear(nums,1,n-1);
        return Math.max(case1,case2);
    }

    public int roblinear(int nums[],int start, int end){
        int n=end-start+1;
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=nums[start];
        for(int i=1;i<n;i++){
            dp[i+1]=Math.max(dp[i],dp[i-1]+nums[start+i]);
        }
        return dp[n];
    }
}