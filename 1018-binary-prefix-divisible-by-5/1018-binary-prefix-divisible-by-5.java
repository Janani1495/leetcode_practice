class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>list=new ArrayList<>();
         int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix = ((prefix << 1) + nums[i]) % 5; 
            nums[i] = prefix;  
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }return list;
    }
}