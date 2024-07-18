# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def countPairs(self, root, distance):
        """
        :type root: TreeNode
        :type distance: int
        :rtype: int
        """
        self.result = 0
        
        def dfs(node):
            if not node:
                return []
            
            if not node.left and not node.right:
                return [1]
            
            left_distances = dfs(node.left)
            right_distances = dfs(node.right)
            
            for l in left_distances:
                for r in right_distances:
                    if l + r <= distance:
                        self.result += 1
            
            new_distances = []
            for d in left_distances:
                if d + 1 <= distance:
                    new_distances.append(d + 1)
            for d in right_distances:
                if d + 1 <= distance:
                    new_distances.append(d + 1)
            
            return new_distances
        
        dfs(root)
        return self.result
