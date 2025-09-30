class Solution {
    public int findGCD(int[] nums) {
       int max=nums[0];int i;int div;int a=0;
        for(i=1;i<nums.length;i++){
        if(nums[i]>max)
        max=nums[i];
        }
         int min=nums[0];
        for(i=1;i<nums.length;i++){
        if(nums[i]<min)
        min=nums[i];
        }
        int min1=Math.min(min,max);
        for(div=1;div<=min1;div++){
            if(min%div==0&&max%div==0){
            a=div;
            }
        }
        return a;
    }
}