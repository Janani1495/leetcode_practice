class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            else{
                char ch=map.get(s.charAt(i));
                if(ch!=t.charAt(i)){
                    return false;
                }
            }
        }
         HashMap<Character,Character>map1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(!map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i),s.charAt(i));
            }
            else{
                char ch=map1.get(t.charAt(i));
                if(ch!=s.charAt(i)){
                    return false;
                }
            }
        }return true;
    }
}