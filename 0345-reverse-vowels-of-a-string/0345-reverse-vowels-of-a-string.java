class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();


        int i=0;
        int j=s.length()-1;

    while(i<j){

       if (!isVowel(arr[i]) ){
        i++;
       }
       else if (!isVowel(arr[j])){
        j--;
       }
       else{
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       }
       return new String(arr);
    }
    public boolean isVowel(char c){
       c= Character.toLowerCase(c);
         if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
            return true;
         }
         return false;
    }
       
    }
