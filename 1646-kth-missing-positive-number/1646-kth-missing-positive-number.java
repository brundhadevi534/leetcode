class Solution {
    public int findKthPositive(int[] arr, int k) {
        int a=0;int b=1;int i=0;
        while(a<k){
            if(i<arr.length&&arr[i]==b){
                i++;
            }
            else{
                a++;
                if(a==k)return b;
            }
            b++;
        }
        return -1;
    }
}