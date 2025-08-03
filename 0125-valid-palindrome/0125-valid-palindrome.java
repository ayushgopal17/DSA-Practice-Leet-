class Solution {
    public boolean isPalindrome(String s) {
        String new1 =s.toLowerCase().replaceAll("[^a-z0-9]","");
        String save= new1;
       String reverse= new StringBuilder(new1).reverse().toString();

       if(save.equals(reverse))
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}