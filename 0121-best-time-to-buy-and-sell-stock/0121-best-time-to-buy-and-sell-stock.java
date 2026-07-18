class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int bp=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<bp){
                bp=prices[i];
            }
            else{
                int ans=prices[i]-bp;
                max=Math.max(max,ans);
            }
        }
        return max;
    }
}