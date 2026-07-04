class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char org=s.charAt(i);
            char rep=t.charAt(i);
            
            if(!map.containsKey(org)){
                if(!map.containsValue(rep))
                map.put(org,rep);
                else
                return false;
            }
            else{
                char mapchar=map.get(org);
                if(mapchar != rep)
                return false;
            }
        }
        return true;
    }
}