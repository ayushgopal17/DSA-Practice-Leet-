

class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]); 

        List<int[]> result = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            int start = arr[i][0];
            int end   = arr[i][1];

            
            while (i < arr.length - 1 && arr[i + 1][0] <= end) {
                end = Math.max(end, arr[i + 1][1]);
                i++;
            }

            result.add(new int[]{start, end}); 
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}


