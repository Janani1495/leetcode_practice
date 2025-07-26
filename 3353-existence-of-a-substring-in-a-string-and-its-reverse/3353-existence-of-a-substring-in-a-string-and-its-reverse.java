class Solution {
    public boolean isSubstringPresent(String s) {
        List<String>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String str="";
            for(int j=i+2;j<=s.length();j++){
                str=s.substring(i,j);
                list.add(str);
            }
        }System.out.print(list);StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        for(int i=0;i<list.size();i++){
            String s1=list.get(i);
            if(sb.toString().contains(s1)){
                return true;
            }
        }return false;
    }
}