class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
              String word=words[i];
              boolean flag=true;
              for(int j=0;j<word.length();j++){
                if(allowed.indexOf(word.charAt(j))==-1){
                    flag=false;
                }
              }if(flag)count++;
        }return count;
    }
}