class Solution {
    public String[] findWords(String[] words) {
        List<String>list=new ArrayList<>();
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        for(int i=0;i<words.length;i++){
            String ans=words[i];
            String str=words[i].toLowerCase();boolean f1=true;boolean f2=true;boolean f3=true;
            for(int j=0;j<str.length();j++){
                if(s1.indexOf(str.charAt(j))==-1){
                     f1=false;
                }
                if(s2.indexOf(str.charAt(j))==-1){
                     f2=false;
                }
                if(s3.indexOf(str.charAt(j))==-1){
                     f3=false;
                }
            }if(f1==true || f2==true || f3==true){
                list.add(ans);
            }
        }String[] array = list.toArray(new String[0]);
        return array;
    }
}