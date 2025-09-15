class Solution {
    public int search(int[] arr, int target) {
        int start=0;
        int end=arr.length;

        while(start<end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}