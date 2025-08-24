class Solution {
    public int missingNumber(int[] arr) {

        int n=arr.length;
       int sum=n*(n+1)/2;

int sum1 =0;
for(int i=0;i<arr.length;i++){
    sum1 = sum1+ arr[i];

}

int ans=sum-sum1;

return ans;
}


    }
