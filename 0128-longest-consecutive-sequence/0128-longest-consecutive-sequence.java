 class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int max = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) { 
                int current = num, streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                max = Math.max(max, streak);
            }
        }
        return max;
    }
}

