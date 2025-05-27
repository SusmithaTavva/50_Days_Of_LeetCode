class Solution {
    public int differenceOfSums(int n, int m) {
        int sumNotDivisible = 0;
        int sumDivisible = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDivisible += i;
            } else {
                sumNotDivisible += i;
            }
        }

        return sumNotDivisible - sumDivisible;
    }
}
