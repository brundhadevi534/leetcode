class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int l=0;int r=s.length()-1;
            boolean res=true;
     while(l<r){
        if(s.charAt(l)!=s.charAt(r)){
        res=false;
        break;
        }
        l++;r--;
     }
     if(res==true)
     return words[i];
        }
        return "";
    }
}