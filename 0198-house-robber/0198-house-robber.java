class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0;      
        int prev1 = 0;     

        for (int num : nums) {
            int pick = prev2 + num;
            int skip = prev1;         
            int curr = Math.max(pick, skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;

    }
}