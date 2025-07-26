class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                str+=s.charAt(i);
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                char ch=s.charAt(i);
                str+=(char)(ch+32);
            }
            else{
                str+=s.charAt(i);
            }
        }return str;
    }
}