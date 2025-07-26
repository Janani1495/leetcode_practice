class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a=(int)(123-ch);
            
            int prod=a*(i+1);
            sum+=prod;
            System.out.print(a+" "+prod+" ");
        }return sum;
    }
}