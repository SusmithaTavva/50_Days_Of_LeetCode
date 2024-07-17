class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Check if nums is empty
        if not nums:
            return 0
        
        # Initialize a pointer for the place of the next unique element
        k = 1
        
        # Iterate through the array starting from the second element
        for i in range(1, len(nums)):
            # If the current element is not equal to the previous element, it's unique
            if nums[i] != nums[i - 1]:
                # Place the unique element at the next position k
                nums[k] = nums[i]
                # Increment k
                k += 1
        
        # Return the number of unique elements
        return k
