class Solution {
    public void moveZeroes(int[] nums) {
       int nonZeroes = 0;
       for(int i =0 ;i< nums.length;i++){
        if(nums[i] != 0 ){
            nums[nonZeroes] = nums[i];
            nonZeroes++;
        }
       }
       for(int i = nonZeroes; i<nums.length;i++){
        nums[i] = 0;
       }
    }
}