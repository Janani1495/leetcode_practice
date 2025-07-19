class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))return "";
       int l1=str1.length();
       int l2=str2.length();
       int gcd=1;int min=Math.min(l1,l2);
       for(int i=min;i>=0;i--){
        if(l1%i==0 && l2%i==0){
            gcd=i;
            break;
        }
       }return str1.substring(0,gcd);
    }
}