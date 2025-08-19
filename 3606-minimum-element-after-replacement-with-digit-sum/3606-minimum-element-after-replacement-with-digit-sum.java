class Solution {
    public int minElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];int count=0;
            while(num!=0){
                count+=num%10;
                num/=10;
            }list.add(count);
        }int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(min>list.get(i)){
                min=list.get(i);
            }
        }return min;
    }
}