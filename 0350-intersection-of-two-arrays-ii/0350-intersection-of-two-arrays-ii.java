class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     int i,j;int k=0;
    boolean[] rem=new boolean[nums2.length];
        int[] res=new int[Math.min(nums1.length,nums2.length)];      
        for(i=0;i<nums1.length;i++){
        for(j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]&&!rem[j]){
                res[k]=nums1[i];
                k++;
                rem[j]=true;
                break;
            }
        }
      } 
      int[] r=new int[k];
      for(i=0;i<k;i++){
        r[i]=res[i];
      }
      return r;
}
}