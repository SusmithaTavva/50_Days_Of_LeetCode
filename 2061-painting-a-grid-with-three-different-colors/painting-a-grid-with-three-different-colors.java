class Solution {
    private static final int MOD = 1_000_000_007;
    List<int[]> patterns = new ArrayList<>();
    Map<Integer, List<Integer>> compat = new HashMap<>();

    public int colorTheGrid(int m, int n) {
        genPatterns(m, 0, new int[m], -1);
        int size = patterns.size();

        for (int i = 0; i < size; i++) {
            compat.put(i, new ArrayList<>());
            for (int j = 0; j < size; j++) {
                if (isCompatible(patterns.get(i), patterns.get(j))) {
                    compat.get(i).add(j);
                }
            }
        }

        int[][] dp = new int[n][size];
        for (int i = 0; i < size; i++) dp[0][i] = 1;

        for (int col = 1; col < n; col++) {
            for (int i = 0; i < size; i++) {
                for (int j : compat.get(i)) {
                    dp[col][i] = (dp[col][i] + dp[col - 1][j]) % MOD;
                }
            }
        }

        int res = 0;
        for (int val : dp[n - 1]) res = (res + val) % MOD;
        return res;
    }

    private void genPatterns(int m, int idx, int[] curr, int prev) {
        if (idx == m) {
            patterns.add(curr.clone());
            return;
        }
        for (int c = 1; c <= 3; c++) {
            if (c != prev) {
                curr[idx] = c;
                genPatterns(m, idx + 1, curr, c);
            }
        }
    }

    private boolean isCompatible(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) if (a[i] == b[i]) return false;
        return true;
    }
}
