class Solution {
    public void reverseString(char[] s) {
       int i=0;
       int j=s.length-1;
       while(i<j){
         swap(s,i,j);
        i++;
        j--;
       }
    }
    void swap(char[] s,int first,int second){
        char temp=s[first];
        s[first]=s[second];
        s[second]=temp;

        
    }
}