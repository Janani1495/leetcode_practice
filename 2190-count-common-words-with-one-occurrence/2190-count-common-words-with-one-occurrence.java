class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer>map=new HashMap<>();
        HashMap<String,Integer>map1=new HashMap<>();
        for(int i=0;i<words1.length;i++){
                map.put(words1[i],map.getOrDefault(words1[i],0)+1);
            
        }
        for(int i=0;i<words2.length;i++){
           
                map1.put(words2[i],map1.getOrDefault(words2[i],0)+1);
            
        }System.out.print(map);
        System.out.print(map1);
        int count=0;
          for (String word : map.keySet()) {
            if (map.get(word) == 1 && map1.getOrDefault(word, 0) == 1) {
                count++;
            }
        }
        
        return count;
        
    }
}