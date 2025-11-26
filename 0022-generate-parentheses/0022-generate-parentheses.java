class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        int open=n;
        int close=n;
        String curr="";
        param(open,close,curr,ans);
        return ans;
    }
    void param(int open,int close,String curr,ArrayList<String> ans){
 if(open==0 && close==0){
        ans.add(curr);
        return;
       }
        if(open>0){
            param(open-1,close,curr+"(",ans);
        }
        if(close>open){
            param(open,close-1,curr+")",ans);
        }
      
    }
}