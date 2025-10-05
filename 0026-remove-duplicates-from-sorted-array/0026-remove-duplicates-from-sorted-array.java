class Solution {
    public int removeDuplicates(int[] nums) {
         int a=1;int i;
         if(nums.length==0){
            return 0;
         }
        for(i=1;i<nums.length;i++){
        if(nums[i]!=nums[a-1]){
        nums[a]=nums[i];
        a++;
        }
        }
        return a;
    }
}