class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        int vote=0;

        for(int i=0;i<nums.length;i++){
            if(vote==0){
                vote++;
                max=nums[i];
            }
            else if(max==nums[i]){
                vote++;
            }
            else{
                vote--;
            }
           
        }
         return max;
    }
}