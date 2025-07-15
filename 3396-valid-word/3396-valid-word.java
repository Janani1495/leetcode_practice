class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)return false;
        boolean vowel=false;boolean con=false;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c))return false;
            if(Character.isLetter(c)){
                if(isVowel(c)){
                   vowel=true;
                }
                else{
                    con=true;
                }
            }
        }return vowel && con;
    }
    public boolean isVowel(char c){
        char ch=Character.toLowerCase(c);
        return ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i';
    }
}