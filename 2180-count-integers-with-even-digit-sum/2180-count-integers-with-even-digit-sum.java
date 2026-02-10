class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int sum=0;
            if(i>9){
                int temp=i;
                while(temp>0){
                    sum+=temp%10;
                    temp/=10;
                }if(sum%2==0){
                count++;
            }
            }
            else{
               if(i%2==0){
                count++;
               }
            }
             
        }return count;
    }
}