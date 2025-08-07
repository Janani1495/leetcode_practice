class Solution {
    public String reversePrefix(String word, char ch) {
       StringBuilder sb=new StringBuilder();int ind=0;
       for(int i=0;i<word.length();i++){
        char c=word.charAt(i);
        if(ch==c){
           ind=i;
           break;
        }
       } 
       for(int i=0;i<=ind;i++){
        sb.append(word.charAt(i));
       }sb.reverse();
       System.out.print(ind);
        for(int i=ind+1;i<word.length();i++){
        sb.append(word.charAt(i));
       }
       return sb.toString();
    }
}