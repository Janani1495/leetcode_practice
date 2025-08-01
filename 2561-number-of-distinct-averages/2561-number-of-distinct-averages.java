class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int left=0;int right=nums.length-1;
        HashSet<Double>set=new HashSet<>();
        while(right>left){
            double a=nums[left];double b=nums[right];
            double ans=(a+b)/2;
            right--;
            left++;
            set.add(ans);
            System.out.print(ans+" ");
        }return set.size();
    }
}