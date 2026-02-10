class Solution {
    public int addDigits(int num) {
        int dig=num;
        while(dig>9){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }num=sum;
        dig=sum;
        }return dig;
    }
}