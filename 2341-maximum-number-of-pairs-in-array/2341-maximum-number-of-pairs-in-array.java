class Solution {
    public int[] numberOfPairs(int[] nums) {
     int n=nums.length;
          Arrays.sort(nums);
     int a=0;int b=0;int i=0;
     while(i<n){
        if(i+1<n&&nums[i]==nums[i+1]){
            a++;
            i=i+2;
        }
        else{
        b++;
        i++;
     } 
     }
     return new int[]{a,b};
    }
}