class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int left = 1, right = x;
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // To avoid overflow, we use division instead of multiplication
            if (mid <= x / mid) {
                result = mid; // mid^2 <= x
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}
