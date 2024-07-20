class Solution {
    public int pivotIndex(int[] nums) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        // Initialize the left sum to 0
        int leftSum = 0;
        
        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // The right sum is calculated as totalSum - leftSum - nums[i]
            // If left sum equals the right sum, we found the pivot index
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            
            // Update the left sum
            leftSum += nums[i];
        }
        
        // If no pivot index is found, return -1
        return -1;
    }
}
