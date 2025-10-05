class Solution {
    public int removeDuplicates(int[] nums) {
         int a=2;int i;
         if(nums.length==0){
            return 0;
         }
        for(i=2;i<nums.length;i++){
        if(nums[i]!=nums[a-2]){
        nums[a]=nums[i];
        a++;
        }
        }
        return a;
    }
}