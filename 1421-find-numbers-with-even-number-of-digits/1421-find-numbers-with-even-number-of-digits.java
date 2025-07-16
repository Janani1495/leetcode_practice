class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num:nums){
            int count=0;
            while(num!=0){
                int dig=num%10;
                count++;
                num/=10;
            }if(count%2==0){
                c++;
            }
        }return c;
    }
}