class Solution {
    public int romanToInt(String s) {
        
        Map<Character,Integer> map=Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);

        int sum=0;
        int i=0;

        while(i<s.length())
        {
            if( i+1<s.length() && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                sum=sum+(map.get(s.charAt(i+1))-map.get(s.charAt(i)));
                i=i+2;}
            else {
               sum=sum+map.get(s.charAt(i));
                i=i+1;
            }
        }
        return sum;
    }
}
 
            