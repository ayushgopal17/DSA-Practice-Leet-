class Solution {
    public void sortColors(int[] arr) {
       for(int j=0;j<arr.length;j++){
        for(int i=0;i<arr.length-j-1;i++){
           if( arr[i]>arr[i+1])
           {
            swap(arr,i,i+1);
           }

        }
    }
    }
    void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}