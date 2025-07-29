class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }List<Integer>list=new ArrayList<>();boolean flag=true;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            
            int num=entry.getValue();
            if(!list.contains(num)){
                list.add(num);
            }
        }System.out.print(map);System.out.print(list);
        return list.size()==map.size();
    }
}