class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[]arr=(s1+" "+s2).split(" ");
        List<String>list=new ArrayList<>();
        HashMap<String, Integer>map=new HashMap<>();
        for(String s: arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer>entry:map.entrySet()){
              if(entry.getValue()==1){
                list.add(entry.getKey());
              }
        }String[]arr1=new String[list.size()];
        for(int i=0;i<list.size();i++){
            arr1[i]=list.get(i);
        }return arr1;
    }
}