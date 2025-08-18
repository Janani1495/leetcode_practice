class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[]perm_arr=new int[m];
        int[] ans = new int[queries.length];
        for(int i=0;i<m;i++){
            perm_arr[i]=i+1;
        }
        for(int i=0;i<queries.length;i++){
            int val=queries[i];int ind=0;
            for(int j=0;j<m;j++){
                if(val==perm_arr[j]){
                    ind=j;
                    break;
                }
            }ans[i]=ind;
            for(int k=ind;k>0;k--){
                int temp=perm_arr[k];
                perm_arr[k]=perm_arr[k-1];
                perm_arr[k-1]=temp;
            }
        }return ans;
    }
}