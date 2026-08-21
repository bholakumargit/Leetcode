class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, left = n, right = 0;

        for (int i =0;i<n; i++) {
            for (int j = i+1; j<n; j++) {
                if (nums[i] > nums[j]) {
                    left = Math.min(left, i);
                    right = Math.max(right, j);
                }
            }
        }

        return right> left ? right - left + 1 : 0;
    }
}