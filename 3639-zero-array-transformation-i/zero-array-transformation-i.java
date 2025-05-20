class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] freq = new int[n + 1];  // using diff array trick

        // Count how many times each index is included in any query
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            freq[l] += 1;
            if (r + 1 < n) freq[r + 1] -= 1;
        }

        // Prefix sum to get actual frequency per index
        int[] count = new int[n];
        int running = 0;
        for (int i = 0; i < n; i++) {
            running += freq[i];
            count[i] = running;
        }

        // Check if each index can be reduced to 0
        for (int i = 0; i < n; i++) {
            if (nums[i] > count[i]) return false;
        }

        return true;
    }
}
