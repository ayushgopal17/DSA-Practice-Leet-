class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0;
        }

        Set<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
           set.add(arr[i]);
        }

        int max=0;

        for(int nums : set)
        {
        

        if(!set.contains(nums-1)){
            int cnum=nums;
            int cstreak=1;

            while(set.contains(cnum +1))
            {
            cnum++;
            cstreak++;
        }
        if(cstreak>max)
        {
            max=cstreak;
        }
        
    }

    }
  return max;  
}
}
 
