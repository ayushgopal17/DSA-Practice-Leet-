class Solution {
    public int maxProfit(int[] arr) {

        int minval=Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<arr.length;i++){
       if(arr[i]<minval){
       minval=arr[i];
       }
       else{
        int profit = arr[i]-minval;
        if(profit>ans)
        ans=profit;
       }
        }
      return ans;
    }
    

}