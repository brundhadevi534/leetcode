class Solution {
    public void rotate(int[] nums, int k) {
        int i;int j;int temp;
    int a=nums.length;
    int b=k%a;
      for(i=0,j=a-1;i<j;i++,j--){
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    for(i=0,j=b-1;i<j;i++,j--){
         temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    for(i=b,j=a-1;i<j;i++,j--){
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
}