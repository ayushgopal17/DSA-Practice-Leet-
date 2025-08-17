class Solution {
    public int pivotIndex(int[] arr) {

        for (int k = 0; k < arr.length; k++) {
            int lsum = 0;
            int rsum = 0;
            for (int i = 0; i < k; i++) {
                lsum = lsum + arr[i];
            }
            for (int j = arr.length - 1; j > k; j--) {
                rsum = rsum + arr[j];
            }
            if (lsum == rsum) {
                return k;
            }

        }
        return -1;

    }
}