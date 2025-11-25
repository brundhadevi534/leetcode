class Solution {
    public int findMiddleIndex(int[] nums) {
   int sum=0;
   for(int num:nums){
    sum=sum+num;
   }
int lsum=0;
for(int i=0;i<nums.length;i++){
   int rsum=sum-lsum-nums[i];
   if(lsum==rsum){
   return i;
   }

        lsum=lsum+nums[i];
    }
        return -1;
    }
}