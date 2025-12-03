class Solution {
    static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" };
    public List<String> letterCombinations(String digits) {
        
        if(digits.isEmpty())
        return new ArrayList<>();
        return helper("",digits); }
        private List<String> helper(String p,String up){
            if(up.isEmpty()){
                ArrayList<String> list=new ArrayList<>();
                list.add(p);
                return list;
            }
           int digit=up.charAt(0)-'0';
           String letter=map[digit];
           List<String> list=new ArrayList<>();
           for(int i=0;i<letter.length();i++){
            char ch=letter.charAt(i);
            list.addAll(helper(p+ch,up.substring(1)));
           }
           return list;

        }
    }
