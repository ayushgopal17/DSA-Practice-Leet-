class Solution {
    public boolean isPalindrome(String s) {

      String t="";

      for(char c : s.toCharArray())  {

        if(Character.isLetterOrDigit(c)){
            t=t+c;
        }
      }
      t=t.toLowerCase();
      int a=0,b=t.length()-1;

      while(a<=b){
         if (t.charAt(a) != t.charAt(b)) return false;
            a++;
            b--;
      }
      return true;
    }
}