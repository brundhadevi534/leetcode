class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[n-1];
        int b=nums[n-2];
        int c=nums[n-3];
        int d=nums[0];
        int e=nums[1];
return Math.max(a*b*c,d*e*a);
    }
}