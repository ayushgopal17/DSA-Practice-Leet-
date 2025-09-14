class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length==1) return 0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max)
          max=i;
        }

        return max;
    }
}