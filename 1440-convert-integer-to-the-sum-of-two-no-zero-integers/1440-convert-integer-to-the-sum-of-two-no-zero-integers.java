class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            if(num(n-i) && num(i)){
                return new int[]{n - i, i};
        
            }
        }return new int[]{};
    }
    public boolean num(int n){
        while(n!=0){
            int dig=n%10;
            if(dig==0){
                return false;
            }n/=10;
        }return true;
    }
}