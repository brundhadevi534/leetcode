class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
      for(int num:nums){
        if(num<min){
        min=num;
      } 
      }
      int a=0;
      for(int num:nums){
        a=a+num;
      }
      return a-min*nums.length;
    }
}