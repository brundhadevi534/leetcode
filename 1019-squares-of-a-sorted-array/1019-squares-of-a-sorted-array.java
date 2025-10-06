class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];int i=0;
        nums[i]=Math.abs(nums[i]);
         for(i=0;i<nums.length;i++){
         res[i]=nums[i]*nums[i];
         }
         Arrays.sort(res);
         return res;
    }
}