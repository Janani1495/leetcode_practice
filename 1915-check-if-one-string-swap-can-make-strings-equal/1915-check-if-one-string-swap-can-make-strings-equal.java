class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())return false;
        if(s1.equals(s2))return true;
       int count=0;String s3="";String s4="";
       for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            s3+=s1.charAt(i);
            s4+=s2.charAt(i);
            count++;
        }
       }boolean flag=true;
       for(int i=0;i<s4.length();i++){
        if(s3.indexOf(s4.charAt(i))==-1){
         flag=false;
        }
       }
       return count==2&& flag==true;
    }
}