class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int sum=prices[i]+prices[j];
                if(sum<=money && sum<min )
                 min=sum;   
                
            }
        }if (min == Integer.MAX_VALUE) {
            return money;  
        } else {
            return money - min;
        }
    }
}