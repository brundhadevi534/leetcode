class Solution {
    public int maxProduct(int n) {
        int max=0;int t=0;int i,j;
        int[] s=String.valueOf(n).chars().map(c->c-'0').toArray();
        for(i=0;i<s.length-1;i++){
        for(j=i+1;j<s.length;j++){
            t=s[i]*s[j];
            if(max<t)
            max=t;
        }
        }
        return max;
    }
}