class Solution {
    public int pivotIndex(int[] nums) {
        
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum +=nums[i];
        }

        int lsum=0;
        int i=0;
        while(i<nums.length){
         
            if(tsum-lsum-nums[i]==lsum){
                  
                return i;
            }
            else{
                   lsum+=nums[i];
                i++;
              
            }
        }
        return -1;
    }
}