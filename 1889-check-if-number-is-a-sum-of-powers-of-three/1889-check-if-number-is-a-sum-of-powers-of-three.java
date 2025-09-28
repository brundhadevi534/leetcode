class Solution {
    public boolean checkPowersOfThree(int n){
        int num=0;
        while(n!=0){
        num=n%3;
          if(num==2)
          return false;
            n=n/3;
    }
    return true;
}
}