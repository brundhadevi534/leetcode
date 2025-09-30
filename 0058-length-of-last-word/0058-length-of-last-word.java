class Solution {
    public int lengthOfLastWord(String s) {
    s=s.trim();
     int Length=s.lastIndexOf(' ');
     return s.length()-Length-1;

    }
}