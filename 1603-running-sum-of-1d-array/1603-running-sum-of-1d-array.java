class Solution {
    public int[] runningSum(int[] arr) {
        int sum=0;
        int[] arr2=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr2[i]=sum;

        }
        return arr2;
    }
}