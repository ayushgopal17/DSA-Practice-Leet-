class Solution {
    public int search(int[] arr, int target) {

        return binarysearch(arr,target,0,arr.length-1);
    }

    static int binarysearch(int[] arr,int target, int s, int e){

    
        if(s>e){
            return -1;
        }
        int m=s+ (e-s) / 2;
        if(arr[m]== target){
            return m;
        }

        if(target < arr[m]){
            return binarysearch(arr,target,s,m-1);
        }
        return binarysearch(arr,target,m+1,e);
        }
    }
