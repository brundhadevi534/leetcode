class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
      for(i=0;i<nums.length-1;i++){
        for(j=i+1;j<nums.length;j++){
            if(nums[i]==0){
            nums[i]=nums[j];
            nums[j]=0;
            }
        }
      }
    }
}