class Solution {
    public int firstUniqChar(String s) {
        int i;
    for(i=0;i<s.length();i++){
    char a=s.charAt(i);
    if(s.indexOf(a)==s.lastIndexOf(a)){
    return i;
    }
    }
    return -1;
    }
}