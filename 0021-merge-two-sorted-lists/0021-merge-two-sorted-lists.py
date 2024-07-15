# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # Create a dummy node to serve as the start of the merged list
        dummy = ListNode()
        current = dummy
        
        # Traverse both lists and append the smaller value to the current node
        while list1 and list2:
            if list1.val < list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next
            current = current.next
        
        # If one of the lists is not empty, append it to the result
        if list1:
            current.next = list1
        else:
            current.next = list2
        
        # Return the merged list starting from the next of the dummy node
        return dummy.next
