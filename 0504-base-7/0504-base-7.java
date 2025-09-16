class Solution {
    public String convertToBase7(int num) {
        // if(num==0)return "0";
        // StringBuilder str=new StringBuilder();
        // boolean flag=false;String s="-";
        // if(num<0){
        //     flag=true;
        //     num=-1*num;
        // }
        // while(num!=0){
        //     str.append(num%7);
        //     num/=7;
        // }if(!flag)return  str.reverse().toString();
        // else{
        //     str.append(s);
        //     return str.reverse().toString();
            
        // }
        return Integer.toString(num,7);
    }
}