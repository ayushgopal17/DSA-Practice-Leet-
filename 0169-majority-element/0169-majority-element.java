class Solution {
    public int majorityElement(int[] arr) {
        
    int count=0;
    int value=0;
    for(int i=0;i<arr.length;i++){

      if(count==0)
      {
        value=arr[i]; 
      }
        if(arr[i]==value){
            count++;
        }
        else{
            count--;
        }

    }
    return value;
    
     
}
}