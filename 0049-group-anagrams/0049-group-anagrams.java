class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char[]ch=s.toCharArray();
            Arrays.sort(ch);
            String s1=new String(ch);
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }map.get(s1).add(s);
        }
        List<List<String>>list=new ArrayList<>();
        for(List<String>l:map.values()){
            list.add(l);
        }return list;
        }
    }
