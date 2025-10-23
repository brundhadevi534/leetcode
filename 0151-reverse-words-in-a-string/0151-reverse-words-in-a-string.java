class Solution {
    public String reverseWords(String s) {
        int i;
    String[] a=s.trim().split("\\s+");
    String rev=" ";
    for(i=a.length-1;i>=0;i--){
    rev= rev+a[i]+" ";
    }
     String b=rev.trim();
    return b;
    }
}