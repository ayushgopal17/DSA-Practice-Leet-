class Solution {
    public int[] rearrangeArray(int[] arr) {

        int[] temp1 = new int[arr.length / 2];
        int[] temp2 = new int[arr.length / 2];

        int p = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp1[p++] = arr[i];
            } else {
                temp2[n++] = arr[i];
            }
        }
        p = 0;
        n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = temp1[p++];
            } else {
                arr[i] = temp2[n++];
            }
        }

        return arr;
    }
}
