class Solution {
    public int[] countBits(int n) {
        int[]arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int j=i;
            int c=0;
             while(j!=0){
                int num=j%2;
                if(num==1){
                    c++;
                }j/=2;
             }System.out.print(c);
             arr[i]=c;
        }return arr;
    }
}