class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][]ans=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            int k=0;
            for(int j=image[0].length-1;j>=0;j--){
                if(k<image[0].length)
                ans[i][k]=image[i][j];k++;
            }
        }for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
}