class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
        sum+=nums[i];
        }
        int max=sum;
        int left=0;
        for(int right=k;right<nums.length;right++){

            sum= sum-nums[left];
            left++;
            sum=sum+nums[right];
            max=Math.max(max,sum);
            
        }
        return(double) max/k;
    }
}