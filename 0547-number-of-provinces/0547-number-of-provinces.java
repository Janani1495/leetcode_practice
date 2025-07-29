class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(isConnected,visited,i);
                count++;
            }
        }return count;
    }
    public void bfs(int[][]conn,boolean[]visited,int val){
        Queue<Integer>q=new LinkedList<>();
        q.add(val);
        while(q.size()!=0){
            int node=q.remove();
            for (int i = 0; i < conn.length; i++) {
                if (conn[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}