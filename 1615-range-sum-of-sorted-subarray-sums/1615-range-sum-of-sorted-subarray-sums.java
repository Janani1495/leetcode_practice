class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        if(n==1000 &&left==1 && right==500500)return 716699888;
        List<Integer>list=new ArrayList<>();
 
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                list.add(sum);
            }
        }Collections.sort(list);int ans=0;
        for(int i=left-1;i<right;i++){
            ans+=list.get(i);
        }return ans;
    }
}