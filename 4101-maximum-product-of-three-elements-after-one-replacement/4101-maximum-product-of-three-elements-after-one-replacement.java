class Solution {
    public long maxProduct(int[] nums) {
       for(int i=0;i<nums.length;i++)
       nums[i]=Math.abs(nums[i]);
       Arrays.sort(nums);
       int n=nums.length;
       int max1=nums[n-1];
        int max2=nums[n-2]; 
        return (long) max1*max2*100000;
    }
}