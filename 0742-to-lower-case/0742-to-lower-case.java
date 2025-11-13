class Solution {
    public String toLowerCase(String s) {
      if(s.isEmpty()) return "";
      char c=s.charAt(0);
       
      if(c>='A' && c<='Z') c+=32;
      return c+toLowerCase(s.substring(1));
    }
  
}