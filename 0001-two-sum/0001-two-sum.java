class Solution {
    public int[] twoSum(int[] arr, int target) {
       
    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i =0;i<arr.length;i++){
        int diffrence=target-arr[i];
    
    if(map.containsKey(diffrence)){
        return new int[]{ map.get(diffrence),i};
    }

    map.put(arr[i],i);
 }
    return new int[]{-1,-1};

    }
   
}