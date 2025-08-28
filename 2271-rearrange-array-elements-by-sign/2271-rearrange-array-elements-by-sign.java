class Solution {
    public int[] rearrangeArray(int[] arr) {

     int[] res=new int[arr.length];
     int p=0;
     int n=1;

     for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            res[p]=arr[i];
            p += 2;
        }
        else{
            res[n]=arr[i];
            n +=2;
        }
     }
     return res;
    }
}
