class Solution {
    public boolean isMonotonic(int[] nums){
         int i;int size=nums.length-1;int counta=0;int countb=0;boolean a=false;
         for(i=0;i<size;i++){
            if(nums[i]<=nums[i+1]){
                counta++;
            }}
            for(i=0;i<size;i++){
                if(nums[i]>=nums[i+1]){
                countb++;
            }
            }
            if(counta==size||countb==size){
                a=true;
            } 
            else{
            a=false;
            }return a;
}
}