class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        boolean[][]bool=new boolean[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                  if(matrix[i][j]==0){
                    bool[i][j]=true;
                  }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(bool[i][j]==true){
                     fillzero(matrix,i,j);
                }
            }
        }
       
    }
    public void fillzero(int[][]matrix,int m,int n){
           int row=matrix.length;
           int col=matrix[0].length;
           for(int i=0;i<col;i++){
              matrix[m][i]=0;
           }
           for(int i=0;i<row;i++){
            matrix[i][n]=0;
           }
        }
    }
