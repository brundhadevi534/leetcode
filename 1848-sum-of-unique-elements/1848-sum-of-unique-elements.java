class Solution {
    public int sumOfUnique(int[] nums) {
        int i,j;int a=0;int count=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==-99) continue;
         count=1;
        for(j=i+1;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                count++;
                nums[j]=-99;
            }
        }
        if(count==1) 
        a=a+nums[i];
    }
    return a;
}
}