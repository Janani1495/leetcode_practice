class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        int row=grid.length;
        int col=grid[0].length;
        int[]ans=new int[col];int k=0;
       
        for(int i=0;i<col;i++){
             int max=0;
            for(int j=0;j<row;j++){
               int val=countnum(grid[j][i]);
               max=Math.max(max,val);
            }ans[i]=max;
        }return ans;
    }
    public int countnum(int num){
        if(num==0)return 1;
        int count=0;
        if(num<0){
            count=1;
            num=-num;
        }
        while(num!=0){
            count++;
            num/=10;
        }return count;
    }
}