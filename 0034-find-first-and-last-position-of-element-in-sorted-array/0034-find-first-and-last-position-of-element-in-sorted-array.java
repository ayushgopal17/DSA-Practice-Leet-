class Solution {
    public int[] searchRange(int[] arr, int target) {
       int left=search(arr,target,true);
       int right=search(arr,target,false);
       return new int[]{left,right};
    }

    public int search(int[] arr,int target,boolean isfirst){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                ans=mid;
                if(isfirst){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return ans;
    }
}