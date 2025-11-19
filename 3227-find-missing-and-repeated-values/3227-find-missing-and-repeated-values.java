class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n=grid.length;
      int max=n*n;
      int[] count=new int[max+1];
      int r=-1;int m=-1;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            count[grid[i][j]]++;
        }
      }  
      for(int a=1;a<=max;a++){
        if(count[a]==2)
         r=a;
        if(count[a]==0)
         m=a;
      }
      return new int[]{r,m};
    }
}