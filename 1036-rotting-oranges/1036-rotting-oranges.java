class Solution {
    int m,n;
    class pair{
        int x;
        int y;
        pair(int x,int y){
          this.x=x;
          this.y=y;
        }
    }
    int[][]direction={{0,1},{0,-1},{1,0},{-1,0}};
    boolean issafe(int i,int j){
        return i>=0 && i<m && j>=0 && j<n;
    }
    public int orangesRotting(int[][] grid) {
        Queue<pair>q=new LinkedList<>();
        m=grid.length;
        n=grid[0].length;
        int fresh=0;
        int minutes=-1;
         boolean[][]visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new pair(i,j));
                    visited[i][j]=true;
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;
       
        while(!q.isEmpty()){
            int size=q.size();
             minutes++;
            for(int k=0;k<size;k++){
                pair current=q.poll();
                for(int i=0;i<direction.length;i++){
                    int newi=current.x+direction[i][0];
                    int newj=current.y+direction[i][1];
                    if(issafe(newi,newj) && !visited[newi][newj] && grid[newi][newj]==1){
                      grid[newi][newj]=2;
                      q.offer(new pair(newi,newj));
                      fresh--;  
                    }
                }
            }
        }
        return fresh==0?minutes:-1;
    }
}