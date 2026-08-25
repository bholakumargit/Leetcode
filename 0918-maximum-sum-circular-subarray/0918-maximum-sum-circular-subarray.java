class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, max = nums[0], min = nums[0], curMax = 0, curMin = 0;

        for (int x : nums) {
            curMax = Math.max(x, curMax + x);
            max = Math.max(max, curMax);

            curMin = Math.min(x, curMin + x);
            min = Math.min(min, curMin);

            total += x;
        }

        return max < 0 ? max : Math.max(max, total - min);
    }
}