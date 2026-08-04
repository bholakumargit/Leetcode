class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int lastIndex= nums.length - 1;
        int maxreach= nums[0];
        for (int i=0; i<= maxreach; i++) {
            if (maxreach >= lastIndex) {
                return true;
            }
            else {
                maxreach = Math.max(maxreach, nums[i] + i);
            }
        }
        return false;
    }
}