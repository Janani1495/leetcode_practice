class Solution {
    int direction[][]={{0,1},{1,0},{-1,0},{0,-1}};
    int n,m;
    public int numIslands(char[][] grid) {
         m=grid.length;
         n=grid[0].length;
        boolean[][]visited=new boolean[m][n];int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    count++;
                    //visited[i][j]=true;
                    dfs(grid,i,j,visited);
                }
            }
        }return count;
    }
    public boolean isSafe(int i,int j){
        return i>=0 && i<m && j>=0 && j<n;
    }
    public void dfs(char[][]grid,int i,int j,boolean[][]visited){
        visited[i][j]=true;
        for(int k=0;k<direction.length;k++){
            int newi=i+direction[k][0];
            int newj=j+direction[k][1];
            if(isSafe(newi,newj) && !visited[newi][newj] && grid[newi][newj]=='1'){
                dfs(grid,newi,newj,visited);
            }
        }
    }
}