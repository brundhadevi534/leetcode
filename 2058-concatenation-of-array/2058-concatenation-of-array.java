class Solution {
    public int[] getConcatenation(int[] nums) {
      int size=nums.length;int i;
       int[] ans=new int[size*2];
      for(i=0;i<size;i++){
      ans[i]=nums[i];
      }
      for(i=0;i<size;i++){
      ans[i+size]=nums[i];
      }
      return ans;
    }
}