class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[]freq=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            freq[ransomNote.charAt(i)-97]++;
        }
         for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0)return false;
        }return true;
    }
}