class Solution {
    public int divide(int dividend, int divisor) {
        // Handle special cases
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Handle overflow
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert both numbers to positive
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        int quotient = 0;
        // Find the largest multiple
        while (dividendL >= divisorL) {
            long temp = divisorL, multiple = 1;
            while (dividendL >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            // Subtract the found multiple from the dividend
            dividendL -= temp;
            // Add the multiple to the quotient
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }
}
