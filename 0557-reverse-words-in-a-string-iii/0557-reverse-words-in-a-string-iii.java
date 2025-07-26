class Solution {
    public String reverseWords(String s) {
        String[]arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String st:arr){
            StringBuilder str=new StringBuilder(st);
            sb.append(str.reverse().toString());
            sb.append(" ");
        }return sb.toString().trim();
    }
}