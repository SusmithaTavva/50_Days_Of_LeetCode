class Solution:
    def twoSum(self, nums, target):
        # Create a dictionary to store the numbers and their indices
        num_to_index = {}
        
        # Iterate through the array
        for i, num in enumerate(nums):
            # Calculate the complement
            complement = target - num
            
            # Check if the complement is in the dictionary
            if complement in num_to_index:
                # Return the indices of the two numbers
                return [num_to_index[complement], i]
            
            # Add the number and its index to the dictionary
            num_to_index[num] = i

# Example usage:
solution = Solution()
print(solution.twoSum([2, 7, 11, 15], 9))  # Output: [0, 1]
print(solution.twoSum([3, 2, 4], 6))       # Output: [1, 2]
print(solution.twoSum([3, 3], 6))          # Output: [0, 1]
