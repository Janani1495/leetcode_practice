class Solution {
    public String longestPalindrome(String s) {
        String word="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str=s.substring(i,j+1);
                if(ispalindrome(str) && word.length()<str.length()){
                    word=str;
                }
            }
        }return word;
    }
       public boolean ispalindrome(String s1) {
        int left = 0, right = s1.length() - 1;
        while (left < right) {
            if (s1.charAt(left) != s1.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
       }
    }
