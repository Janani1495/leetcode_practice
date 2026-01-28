class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[]arr=new int[num_people];int m=1;
        while(candies>0){
            for(int i=0;i<num_people;i++){
                if(candies<m){
                    m=candies;
                }
                arr[i]+=m;
                candies-=m;
                m++;
            }
        }return arr;
    }
}