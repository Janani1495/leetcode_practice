class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[]arr=new boolean[n];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i*i<n;i++){
            if(arr[i]==false){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=true;
                }
            }
        }int count=0;
        for(int i=0;i<n;i++){
            if(!arr[i]){
                count++;
            }
        }return count;
    }
}