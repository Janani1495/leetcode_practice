class Solution {
    public int mySqrt(int n) {
        if(n<0)return -1;int c=0;int i=1;
        while(n>=0){
            n-=i;
            i+=2;
            c++;
        }return c-1;
    }
}