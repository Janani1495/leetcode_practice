class Solution {
    public int getLucky(String s, int k) {
      StringBuilder numStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            numStr.append((int)(c - 'a' + 1));
        }
        int ans = 0;
        for (int i = 0; i < numStr.length(); i++) {
            ans += numStr.charAt(i) - '0';
        }
        for(int i=1;i<k;i++){
           int sum=0;System.out.println(ans);
            while(ans!=0){
               sum+=ans%10;
               ans/=10;
            }ans=sum;
            System.out.print(sum+" ");
            
        }return ans;
    }
}