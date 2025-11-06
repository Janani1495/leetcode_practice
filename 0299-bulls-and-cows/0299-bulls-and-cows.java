class Solution {
    public String getHint(String secret, String guess) {
        int[]arr_1=new int[10];
        int[]arr_2=new int[10];int cows=0;int bulls=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }else{
                arr_1[secret.charAt(i)-'0']++;
                arr_2[guess.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<10;i++){
            cows+=Math.min(arr_1[i],arr_2[i]);
        }return bulls+"A"+cows+"B";
    }
}