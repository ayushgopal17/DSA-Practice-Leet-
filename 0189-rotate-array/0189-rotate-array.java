class Solution {
    public void rotate(int[] arr, int k) {
       
      int n=arr.length;
      k=k%n; 

      int[] temp=new int[k];

for(int i=0;i<k;i++){
    temp[i]=arr[n-k+i];
}
for(int j=n-k-1;j>=0;j--){
    arr[j+k]=arr[j];

  
}

for(int j=0;j<k;j++){
arr[j]=temp[j];
      }
    }
}
     

