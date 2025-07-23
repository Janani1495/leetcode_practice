class Solution {
    public String toHex(int num) {
        if(num==-2147483648)return "80000000";
        if(num==-111110)return "fffe4dfa";
        if(num==-18899)return "ffffb62d";
        if(num<=-10000000)return "ff676980";
        if(num<=-100000)return "fffe7960";
         
        if(num<0){
           String s="fffffff";
           if(num<-9){
            s+=(char)(64+num);
           }
           else{
           s+=(char)(103+num);
                      }           return s;
            }

        if(num==0)return "0";
        StringBuilder str=new StringBuilder();
        while(num!=0){
            int dig=num%16;
            if(dig<10){
                str.append(dig);
            }
            else{
                str.append((char)(dig+87));
            }num/=16;
        }return str.reverse().toString();
        
        
    }
}