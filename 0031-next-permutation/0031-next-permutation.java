class Solution {
    public void nextPermutation(int[] arr) {


        int n=arr.length;

int inx=-1;
for(int i=n-2;i>=0;i--){
 if(arr[i]<arr[i+1]){
    inx=i;
    break;
 }
}
if(inx ==-1){

    reverse(arr,0,n-1);
    return;
}

for(int i=n-1; i > inx;i--){

    if(arr[i] > arr[inx])
    {
        swap(arr,i,inx);
        break;
    }
}
reverse(arr,inx+1,n-1);
    }
void swap(int[] arr,int first,int second) {
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}

void reverse(int[] arr,int i,int j){
    while(i<j){
        swap(arr,i,j);
        i++;
        j--;
    }
}
        
    
}