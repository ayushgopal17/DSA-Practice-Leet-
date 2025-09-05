class Solution {
    public int maxProduct(int[] arr) {
       
       int n=arr.length;
       int ans=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
        int product=1;
        for(int j=i;j<n;j++){
            product *=arr[j];
            ans=Math.max(ans,product);
        }
       }
        return ans;
    }
}