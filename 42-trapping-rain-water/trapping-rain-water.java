class Solution {
    public int trap(int[] height) {
      if(height == null){
        return 0;
      }  
      int ans = 0;
      int left = 0;
      int right = height.length-1;
      int maxL = height[left];
      int maxR = height[right];
      while(left<right){
        if(maxL < maxR){
            ans += maxL - height[left];
            left++;
            maxL = Math.max(maxL , height[left]);
        }else{
            ans += maxR - height[right];
            right--;
            maxR = Math.max(maxR, height[right]);
        }
      }
      return ans;
    }
}