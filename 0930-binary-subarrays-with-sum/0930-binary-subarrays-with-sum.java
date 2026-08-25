class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    int atMost(int[] a, int k) {
        if (k < 0) return 0;
        int l = 0, sum = 0, ans = 0;

        for (int r = 0; r < a.length; r++) {
            sum += a[r];
            while (sum > k) sum -= a[l++];
            ans += r - l + 1;
        }
        return ans;
    }
}