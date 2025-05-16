class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int n = height.length-1;
        int max = 0;
        while(i<n){
            int w = n - i;
            int h = Math.min(height[i] , height[n]);
            int area = w * h;
            if(height[i] < height[n]){
                i++;
            } else{
                n--;
            }
            max = Math.max(max,area);
        }
        return max;
        
    }
}