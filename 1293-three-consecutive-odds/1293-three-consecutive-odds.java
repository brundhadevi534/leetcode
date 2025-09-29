class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i;boolean a=false;
       for(i=0;i<=arr.length-3;i++)
        if(arr[i]%2!=0&&arr[i+1]%2!=0&&arr[i+2]%2!=0){
            a=true;
        }
        return a;
    }
}