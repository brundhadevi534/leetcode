class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i,j;int k=0;int a;
        int[] res=new int[Math.min(nums1.length,nums2.length)];      
        for(i=0;i<nums1.length;i++){
        for(j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
            boolean answer=false;
            for(a=0;a<k;a++){
            if(res[a]==nums1[i]){
                answer=true;
                break;
            }    
            }
            if(!answer){
                res[k]=nums1[i];
                k++;
            }
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