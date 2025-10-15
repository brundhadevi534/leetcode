class Solution {
    public int findDuplicate(int[] nums) {
     int i;int a=0;
     Arrays.sort(nums);
        for(i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
        return nums[i];
        }
  }   
   return -1;  
    }
}