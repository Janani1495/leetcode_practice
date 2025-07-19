class Solution {
    public int tribonacci(int n) {
        if(n==1 || n==2)return 1;
        int n1=0;int n2=1;int n3=1;int temp=0;
        for(int i=0;i<n-2;i++){
            temp=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=temp;
        }return temp;
    }
}