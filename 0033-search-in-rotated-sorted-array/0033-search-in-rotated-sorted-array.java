class Solution {
    public int search(int[] nums, int target) {
        int a=0;int i;
        for(i=0;i<nums.length;i++){
            if(target==nums[i]){
                a=i;
                return a;
            }
        }
        return -1;
    }
}