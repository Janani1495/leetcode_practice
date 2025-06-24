class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>list=new ArrayList<>();
        int[]arr=new int[nums.length];int k1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                arr[k1]=i;
                k1++;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int l=0;l<k1;l++){
                 if(Math.abs(i-arr[l])<=k ){
                    list.add(i);
                    break;
                 }
            }
            
        }return list;
    }
}