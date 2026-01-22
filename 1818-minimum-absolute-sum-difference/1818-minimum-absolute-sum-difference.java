class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int MOD = 1_000_000_007;
        int n = nums1.length;
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += Math.abs(nums1[i] - nums2[i]);
        }
        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);
        long maxReduction = 0;
        for (int i = 0; i < n; i++) {
            int currentDiff = Math.abs(nums1[i] - nums2[i]);
            int idx = Arrays.binarySearch(sortedNums1, nums2[i]);

            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx < n) {
                int newDiff = Math.abs(sortedNums1[idx] - nums2[i]);
                maxReduction = Math.max(maxReduction, currentDiff - newDiff);
            }
            if (idx > 0) {
                int newDiff = Math.abs(sortedNums1[idx - 1] - nums2[i]);
                maxReduction = Math.max(maxReduction, currentDiff - newDiff);
            }
        }
        return (int)((totalSum - maxReduction) % MOD);
    }
}