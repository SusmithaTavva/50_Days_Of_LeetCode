class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        while(j<=k){
            if(nums[j] == 1){
                j++;
            }
            else if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }
            else{
                int t = nums[j];
                nums[j] = nums[k];
                nums[k] = t;
                k--;
            }
        }
    
    }
}