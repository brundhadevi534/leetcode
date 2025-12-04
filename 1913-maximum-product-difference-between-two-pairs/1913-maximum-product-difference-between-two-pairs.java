class Solution {
    public int maxProductDifference(int[] nums) {
     Arrays.sort(nums);
     int a=nums.length;
     int p1=nums[a-2]*nums[a-1];
     int p2=nums[0]*nums[1];
     int res=p1-p2;
     return res; 
    }
}