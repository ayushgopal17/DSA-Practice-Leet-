class Solution {
    public int[][] merge(int[][] arr) {
        int n=arr.length;

        Arrays.sort(arr,new Comparator<int []>(){

            public int compare(int[] a,int[] b){
                if(a[0]==b[0]){
                  return  a[1]-b[1];
                }
                else{
                    return  a[0]-b[0];
                }
            }
        });
 List<int[]> result = new ArrayList<>();

    int i=0;
    while(i<n){
        int start=arr[i][0];
        int end= arr[i][1];

        while(i<n-1 && arr[i+1][0]<=end){
            end=Math.max(end,arr[i+1][1]);
            i++;
        }

        result.add(new int[]{start,end});
        i++;
    }
    return result.toArray(new int[result.size()][]);


        }
        
    }
