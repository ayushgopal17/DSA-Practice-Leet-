class Solution {
    public int findNumbers(int[] nums) {
   
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(digit(num)%2==0) {
                count++;
            }
        }
        return count;
    }
     int digit(int num)
    {
        int count=0;
        while (num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
}