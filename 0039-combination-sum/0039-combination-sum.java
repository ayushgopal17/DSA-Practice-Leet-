class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list= new ArrayList<>();
         comsum(list,new ArrayList<>(),candidates,target,0);
        return list;
       
    }
    private void comsum(List<List<Integer>> list,List<Integer> templist,int[] nums,int target,int start){

if(target<0) return;
if(target==0) list.add(new ArrayList<>(templist));
else{
    for(int i=start;i<nums.length;i++){
        templist.add(nums[i]);
        comsum(list,templist,nums,target-nums[i],i);
        templist.remove(templist.size()-1);
    }
}
    }
}