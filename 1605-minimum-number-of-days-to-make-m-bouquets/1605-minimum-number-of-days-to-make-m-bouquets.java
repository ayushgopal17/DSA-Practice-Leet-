class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

      int n=bloomDay.length; 
      int start=min(bloomDay);
      int end=max(bloomDay);
      int ans=end;
    

      if((long)n<(long)m*k) return -1;

      while(start<=end){
        int mid=start+(end-start)/2;
        if(possible(bloomDay,m,k,mid)){
            ans=mid;
            end=mid-1;
        }else{
            start=mid+1;
        }
      }
      return ans;
  
    }
    static int min(int[] bloomDay) {
        int ans=bloomDay[0];
        for(int i=0; i<bloomDay.length;i++){
            if(bloomDay[i]<ans){
                ans= bloomDay[i];
            }
        }
        return ans;
    } 

    static int max(int[] bloomDay){
        int ans=bloomDay[0];
        for(int i=0; i<bloomDay.length;i++){
            if(bloomDay[i]>ans){
                ans=bloomDay[i];
            }
        }
        return ans;
    }
    static boolean possible(int[] bloomDay, int m, int k, int days) {
    int b=0;
    int c=0;
    for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=days){
            c++;
        
        if(c==k){
            b++;
            c=0;
        }
    }
    else{
        c=0;
    }

}
return b >= m;
}


}