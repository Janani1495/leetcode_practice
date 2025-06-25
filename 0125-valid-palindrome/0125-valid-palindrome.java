class Solution {
    public boolean isPalindrome(String s) {
      String s1=s.toLowerCase();
      String ss=s1.replaceAll("[^a-z0-9]","");
      if(ss.length()==1){
        return true;
      }
      StringBuilder sb=new StringBuilder(ss);
      return (sb.reverse().toString()).equals(ss);
    }
}