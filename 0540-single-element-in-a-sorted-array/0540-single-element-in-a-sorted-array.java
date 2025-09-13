class Solution {
    public int singleNonDuplicate(int[] arr) {
        
        //if(arr.length==0) return arr[0];
        if(arr.length==1) return arr[0];

        
        int start=1;
        int end=arr.length-2;


    if(arr[0] !=arr[1] ){
                return arr[0];
            }

           if(arr[arr.length-1] !=arr[arr.length-2]){
            return arr[arr.length-1];
          }
        while(start<=end){
            int mid=start+(end-start)/2;

            

            if(arr[mid] !=arr[mid+1] && arr[mid] !=arr[mid-1])
            return arr[mid];

            if( (mid%2==1 &&arr[mid-1]==arr[mid]) || ( mid%2==0 &&arr[mid]==arr[mid+1] )){
              start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}