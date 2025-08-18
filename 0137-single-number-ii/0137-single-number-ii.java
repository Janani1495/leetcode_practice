class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry_map:map.entrySet()){
          if(entry_map.getValue()==1){
               ans=entry_map.getKey();
          }
        }return ans;
    }
}