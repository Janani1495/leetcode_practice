class Solution {
    public int numberOfSpecialChars(String word) {
        int[]freq=new int[26];
        int[]freq_1=new int[26];
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                freq[word.charAt(i)-'A']++;
            }
             if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                freq_1[word.charAt(i)-'a']++;
            }
        }int num=0;
        for(int i=0;i<26;i++){
            if(freq[i]>=1 && freq_1[i]>=1){
                num++;
            }
        } for(int i=0;i<26;i++){
            System.out.print(freq[i]);
        }
        for(int i=0;i<26;i++){
            System.out.print(freq_1[i]);
        }
        return num;
    }
}