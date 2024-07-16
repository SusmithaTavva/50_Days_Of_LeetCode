class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        # Pointer for the next position to place an element not equal to val
        k = 0
        
        # Iterate through all elements in the array
        for i in range(len(nums)):
            # If the current element is not equal to val, place it at the k-th position
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
        
        # Return the number of elements not equal to val
        return k
