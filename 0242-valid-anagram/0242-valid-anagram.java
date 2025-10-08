class Solution {
    public boolean isAnagram(String s, String t) {
       boolean same=true;
       if(s.length()!=t.length())
       same=false;
       else{
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray(); 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        same=Arrays.equals(arr1,arr2);
       } 
       if(same)
       return true;
       else
       return false;
    }
}