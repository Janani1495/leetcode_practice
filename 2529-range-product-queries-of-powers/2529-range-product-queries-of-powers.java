class Solution {
    public int[] productQueries(int n, int[][] queries) {
         List<Integer> list = new ArrayList<>();
        int i = 0; final int MOD = 1_000_000_007;
        
        while ((1 << i) <= n) {
            if ((n & (1 << i)) != 0) {
                list.add(1 << i);
            }
            i++;
        }
        System.out.println(list); 
        int[]arr=new int[queries.length];int l=0;
        for(int k=0;k<queries.length;k++){
            int st=queries[k][0];
            int end=queries[k][1];
            long prod = 1;
            for (int j = st; j <= end; j++) {
                prod = (prod * list.get(j)) % MOD; // prevent overflow
            }
            arr[l++] = (int) prod;
        }
        return arr;
    }
}