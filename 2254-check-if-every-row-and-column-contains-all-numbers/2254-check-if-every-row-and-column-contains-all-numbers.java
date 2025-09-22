class Solution {
    public boolean checkValid(int[][] matrix) {
        int size=matrix.length;
        for(int row=0;row<size;row++){
            boolean[]row_arr=new boolean[size];
            boolean[]col_arr=new boolean[size];
            for(int col=0;col<size;col++){
                int num=matrix[row][col];
                if(row_arr[num-1]){
                    return false;
                }row_arr[num-1]=true;
                int num2=matrix[col][row];
                if(col_arr[num2-1]){
                    return false;
                }col_arr[num2-1]=true;
            }
        }return true;
    }
}