class Solution {
    public boolean isHappy(int n) {
        int sum;
        int num=n;
        while(num!=1&&num!=4){
        sum=0;
        int temp=num;
        while(temp>0){
            int a=temp%10;
            sum=sum+a*a;
            temp=temp/10;
        }
        num=sum;
        }
        return num==1;
      }
    }
