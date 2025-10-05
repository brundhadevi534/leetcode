class Solution {
    public int gcdOfOddEvenSums(int n) {
        int div;int a=0;
        int sumodd=n*n;
        int sumeven=n*(n+1);
         int Gcd=Math.min(sumodd,sumeven);
        for(div=1;div<=Gcd;div++){
            if(sumodd%div==0&&sumeven%div==0){
            a=div;
            }
        }
        return a;
    }
}