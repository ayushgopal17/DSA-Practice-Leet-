class Solution {
    public int countHomogenous(String s) {
        
        long ans=0;
        long length=0;

        int MOD=1_000_000_007;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                length +=1;
            }
            else{
                length=1;
            }
            ans = (ans+length) %MOD;
        }
           
      
       return (int)ans;
    }
}