class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]arr=new int[2*nums.length];int k=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }

        for(int i=nums.length;i<2*nums.length;i++){
            if(k<nums.length){
             arr[i]=nums[k];k++;
            }
        }return arr;
    }
}