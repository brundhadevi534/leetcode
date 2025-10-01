class Solution {
    public int missingNumber(int[] nums) {
        int size=nums.length;int c=0;
        int a=size*(size+1)/2;
        int b=0;
        for(int num:nums){
           b=b+num;
           c=a-b;
        }
        return c;
    }
}