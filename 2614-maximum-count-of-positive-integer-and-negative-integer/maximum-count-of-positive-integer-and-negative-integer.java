class Solution {
    public int maximumCount(int[] nums) {
        int countN=0;
        int countP=0;
        for(int i:nums){
            if(i<0){
                countN++;
            }else if(i>0){
                countP++;
            }
        }
        return Math.max(countN,countP);
    }
}