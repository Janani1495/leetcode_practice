class Solution {
    public void rotate(int[] nums, int k) {
          List<Integer>list=new ArrayList<>();
          for(int num:nums){
            list.add(num);
          }
          Collections.rotate(list,k);
          for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
          }
    }
}