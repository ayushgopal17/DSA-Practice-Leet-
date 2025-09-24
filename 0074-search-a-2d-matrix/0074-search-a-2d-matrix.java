class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows=matrix.length;
        int cols=matrix[0].length;

        int start=0;
        int end=rows*cols-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            int midpoint=matrix[mid/cols][mid%cols];

            if(midpoint==target){
                return true;
            }
            else if(midpoint>target){
                end=mid-1;
            }
            else if(midpoint<target){
                start=mid+1;
            }

        }
        return false;
    }
}