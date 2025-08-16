class Solution {
    public int maxSubArray(int[] arr) {
     
     int sum=arr[0];
     int maxsum=arr[0];
     for(int i=1;i<arr.length;i++){
        sum=Math.max(arr[i],sum+arr[i]);
        maxsum=Math.max(sum,maxsum);
     }
     return maxsum;
    }
     }