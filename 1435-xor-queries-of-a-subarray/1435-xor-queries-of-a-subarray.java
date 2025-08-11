class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[]nums=new int[queries.length];int k=0;
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            int num=0; if (b >= arr.length) {
                b = arr.length - 1;
            }

            for(int j=a;j<=b;j++){
               num=num^arr[j];
            }nums[i]=num;
        }return nums;
    }
}