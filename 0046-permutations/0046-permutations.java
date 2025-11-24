class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums);
        return list;
    }
    public void backtrack(List<List<Integer>>list, ArrayList<Integer>temp,int[]nums){
        if(temp.size()==nums.length){
         list.add(new ArrayList<>(temp));
         return;
        } 
        for(int num: nums){
            if(!temp.contains(num)){
                temp.add(num);
                backtrack(list,temp,nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}