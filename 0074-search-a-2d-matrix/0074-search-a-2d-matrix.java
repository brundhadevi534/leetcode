class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int r=matrix.length;
       int c=matrix[0].length;int r1=0;int c1=c-1;
       while(c1>=0&&r1<r){
            if(matrix[r1][c1]==target)
            return true;
            else if(target<matrix[r1][c1])
            c1--;
            else
            r1++;
       } 
       return false;
    }
}