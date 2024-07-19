class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Initialize the answer array with 1s for the first pass
        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }
        
        // First pass: Calculate the left products and store in answer array
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        // Second pass: Calculate the right products and update answer array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return answer;
    }
}
