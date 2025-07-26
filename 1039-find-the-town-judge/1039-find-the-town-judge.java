class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer>outdegree=new HashMap<>();
        HashMap<Integer,Integer>indegree=new HashMap<>();
        for(int []list:trust){
            int a=list[0];int b=list[1];
            outdegree.put(a,outdegree.getOrDefault(a,0)+1);
            indegree.put(b,indegree.getOrDefault(b,0)+1);
        }
        for (int i = 1; i <= n; i++) {
            int trustedBy = indegree.getOrDefault(i, 0);
            int trustsOthers = outdegree.getOrDefault(i, 0);

            if (trustedBy == n - 1 && trustsOthers == 0) {
                return i; 
            }
        }

        return -1; 
        
    }
}