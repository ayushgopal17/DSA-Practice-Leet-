class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      
      int start=1;
      int end=max(piles);
      int ans=end;

      while(start<=end){
        int mid=start+(end-start)/2;
        
        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours +=(piles[i]+mid-1)/mid;
        }
        if(hours<=h){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
      }
      return ans;

    }

    static int max(int[] piles){
        int maximum=piles[0];
        for(int i=0;i<piles.length;i++){
        
          if( maximum<piles[i] ){
          maximum=piles[i];
          }
        
    }
      return maximum;
      }
    }