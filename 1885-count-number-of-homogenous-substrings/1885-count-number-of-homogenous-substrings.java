class Solution {
    public int countHomogenous(String s) {
        int ans=0;
        int length=0;
        int Mod=1_000_000_007;

        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i-1)==s.charAt(i)){
                length +=1;
            }
            else{
                length=1;
            }
            ans=(ans+length) %Mod;
        }
        return ans;
    }
}