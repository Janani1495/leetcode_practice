class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][]rows=new boolean[9][9];
        boolean[][]column=new boolean[9][9];
        boolean[][]boxes=new boolean[9][9];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                char ch=board[row][col];
                if(ch=='.')continue;
                int num=ch-'1';
                 int boxIndex = (row / 3) * 3 + (col / 3);
                if(rows[row][num]||column[col][num]||boxes[boxIndex][num]){
                        return false;
                }
                rows[row][num]=true;
                column[col][num]=true;
                boxes[boxIndex][num]=true;
            }
        }return true;
    }
}