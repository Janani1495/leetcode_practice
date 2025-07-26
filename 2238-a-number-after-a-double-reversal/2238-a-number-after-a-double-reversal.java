class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        int rev=0;
        while(num!=0){
          rev=rev*10+num%10;
          num/=10;
        }int ans=0;
        while(rev!=0){
              ans=ans*10+rev%10;
              rev/=10;
        }return ans==n;
    }
}