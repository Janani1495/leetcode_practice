class Solution {
    public int arrangeCoins(int n) {
        int i=1;int c=1;
        while(n>=0){
            n=n-i; if(n>i){
               c++;
            }
            i++;
        } return c;
    }
}