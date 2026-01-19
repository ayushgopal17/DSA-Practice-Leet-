class Solution {
    public int vowelConsonantScore(String s) {
        int vols=0;
        int cons=0;
       for(char c: s.toCharArray()){
        if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'){
            vols++;
        }
        else if (c>= 'a' && c<='z'){
            cons++;
        }
       }
       if(cons>0){
        return vols/cons;
       }
       return 0;
}
}
              
           
     
    