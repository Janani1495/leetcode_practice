class Solution {
    public List<String> stringMatching(String[] words) {
      List<String>list=new ArrayList<>();
      for(int i=0;i<words.length;i++){
        if(substring(words[i],words)){
            list.add(words[i]);
        }
      }return list;
    }
    public boolean substring(String word,String[]words){
        for(int i=0;i<words.length;i++){
            if(!words[i].equals(word) && words[i].contains(word)){
                return true;
            }
        }return false;
    }
}