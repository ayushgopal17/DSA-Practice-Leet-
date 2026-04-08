class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        boolean oddcount=false;
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int length=0;
        for(int count:map.values()){
            length+=(count/2)*2;
            if(count%2==1){
                oddcount=true;
            }
        }
        if(oddcount){
            length+=1;
        }
        return length;
    }
}