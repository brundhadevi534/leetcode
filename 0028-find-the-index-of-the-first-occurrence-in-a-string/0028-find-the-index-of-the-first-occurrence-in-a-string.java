class Solution {
    public int strStr(String haystack, String needle) {
      if(haystack.contains(String.valueOf(needle))){
            return haystack.indexOf(needle);
        }
        return -1;  
    }
}