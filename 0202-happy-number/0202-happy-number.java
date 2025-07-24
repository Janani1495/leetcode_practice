class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int num=n;int sum=0;
            while(num!=0){
                int dig=num%10;
                sum+=dig*dig;
                num/=10;
            }n=sum;
        }return n==1;
    }
}