class Solution {
    public char kthCharacter(int k) {
        String str="a";
        while(str.length()<k){
            StringBuilder sb=new StringBuilder();
            for(char c:str.toCharArray()){
                if(c=='z'){
                    sb.append('a');
                }
                else{
                    sb.append((char)(c+1));
                }
            }
                str+=sb.toString();
            
        }return str.charAt(k-1);
    }
}