class Solution {
    public int countCharacters(String[] words, String chars) {
        int[]freq=new int[26];
        for(int i=0;i<chars.length();i++){
            freq[chars.charAt(i)-'a']++;
        }int count=0;
        for(int i=0;i<words.length;i++){
            int[]f=new int[26];
           String s=words[i];boolean flag=true;
           for(int j=0;j<s.length();j++){
            f[s.charAt(j)-'a']++;
           }
           for(int k=0;k<26;k++){
            if(f[k]>freq[k]){flag=false;break;}
           }
           if(flag==true){
            count+=s.length();
            System.out.print(s);
           }
        }return count;
    }
}