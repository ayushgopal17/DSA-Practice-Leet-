class Solution {
    public int removeDuplicates(int[] arr) {

        if (arr.length==0)
        return 0;


        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if (arr[j] != arr[i])
            {
                i=i+1;
            arr[i]=arr[j];
  }
        }
        return i+1;
 }
}