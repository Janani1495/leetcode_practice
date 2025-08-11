class Solution {

    List<List<Integer>>res=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
     
     public void func(int i,int[]nums){
        if(nums.length==i){
            res.add(new ArrayList<>(list));
            return;
        }
        //pick ele

        list.add(nums[i]);
        func(i+1,nums);

        //not pick ele

        list.remove(list.size()-1);
        func(i+1,nums);
     }

    public List<List<Integer>> subsets(int[] nums) {
        // res.clear();
        // list.clear();
        func(0,nums);
        return res;

    }
}