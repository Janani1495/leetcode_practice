class Solution {
    public boolean isPowerOfThree(int n) {
     /*double ans=1;int a=1;
        while(ans<=n){
            if(ans==n){
                return true;
            }
            ans=Math.pow(3,a);
            a++;
        }return false;*/
        if(n<=0) return false;

        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}