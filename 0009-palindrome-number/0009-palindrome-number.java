class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)
        {
            return true;
        }
int temp=x;
int dig=0;

        while(x>0)
        {
        int  n=x%10;
          x=x/10;
       dig =dig*10+n;
        }
        if(temp==dig)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
}