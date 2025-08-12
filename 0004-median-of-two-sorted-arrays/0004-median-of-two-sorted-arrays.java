class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }Collections.sort(list);
        int mid=list.size()/2;
        double val=0.0;
        if(list.size()%2!=0){
             val=list.get(mid);
        }else{
            double a=(double)(list.get(mid));
            double b=(double)(list.get(mid-1));
            val=(a+b)/2;
        }
        return val;
    }
}