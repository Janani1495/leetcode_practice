class Solution {
    public int isWinner(int[] player1, int[] player2) {
        if(player1.length==1 || player2.length==1){
            if(player1[0]==player2[0])return 0;
            return (player1[0]>player2[0])?1:2;
        }
        int sum_1=player1[0];
        if(player1[0]==10){
            sum_1+=2*player1[1];
        }else{
            sum_1+=player1[1];
        }
        for(int i=2;i<player1.length;i++){
            if(player1[i-1]==10 || player1[i-2]==10){
                sum_1+=2*player1[i];
            }else{
            sum_1+=player1[i];
            }
        }
         int sum_2=player2[0];
        if(player2[0]==10){
            sum_2+=2*player2[1];
        }else{
            sum_2+=player2[1];
        }
        for(int i=2;i<player2.length;i++){
            if(player2[i-1]==10 || player2[i-2]==10){
                sum_2+=2*player2[i];
            }else{
            sum_2+=player2[i];
            }
        }
        if(sum_1==sum_2)return 0;
        return (sum_1>sum_2)?1:2;
    }
}