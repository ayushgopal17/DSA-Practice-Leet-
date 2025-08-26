class Solution {
    public void sortColors(int[] arr) {
    int start=0;
    int mid=0;
    int end=arr.length-1;

    while(mid<=end)
    {
 if(arr[mid] ==0){
    swap(arr,start,mid);
    start++;
    mid++;

 }
 else if(arr[mid]==1){
    mid++;
 }
 else{
    swap(arr,mid,end);
    end--;
 }
    }
    }

    void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}