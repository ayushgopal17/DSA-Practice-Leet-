class Solution {
    public int findNumbers(int[] nums) {
        
    int count=0;
    for(int i=0;i<nums.length;i++){
        int num=nums[i];
        if(even(num)){
            count++;
        }
    }
    return count;
    }
    static boolean even(int num){
        int numberofdig=digit(num);
        if(numberofdig%2==0){
            return true;
        }
        return false;
    }
   

    static int digit(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}