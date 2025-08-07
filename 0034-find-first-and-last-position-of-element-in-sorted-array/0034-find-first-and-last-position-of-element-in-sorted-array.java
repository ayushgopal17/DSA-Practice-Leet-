class Solution {
    public int[] searchRange(int[] nums, int target) {
         int start = 0;
        int end = nums.length - 1;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Target found at mid
                int first = mid;
                int last = mid;

                // Binary search for first occurrence
                start = 0;
                end = mid - 1;
                while (start <= end) {
                    int mid1 = start + (end - start) / 2;
                    if (target < nums[mid1]) {
                        end = mid1 - 1;
                    } else if (target > nums[mid1]) {
                        start = mid1 + 1;
                    } else {
                        first = mid1;
                        end = mid1 - 1;
                    }
                }

                // Binary search for last occurrence
                start = mid + 1;
                end = nums.length - 1;
                while (start <= end) {
                    int mid2 = start + (end - start) / 2;
                    if (target < nums[mid2]) {
                        end = mid2 - 1;
                    } else if (target > nums[mid2]) {
                        start = mid2 + 1;
                    } else {
                        last = mid2;
                        start = mid2 + 1;
                    }
                }

                return new int[]{first, last};
            }
        }

        return new int[]{-1, -1};
    }
}