class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[]array=new String[score.length];
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            list.add(score[i]);
        }Collections.sort(list,Collections.reverseOrder());
        //Collections.reverse(list);
        HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i=0;i<score.length;i++){
        //     int ans=0;
        //    for(int j=0;j<score.length;j++){
        //     if(score[i]==list.get(j)){
        //         ans=j+1;
        //     }
        //    }map.put(score[i],ans);
        for(int i=0;i<score.length;i++){
            map.put(list.get(i),i+1);
        }
           System.out.print(map);
        for(int i=0;i<score.length;i++){
            int a=map.get(score[i]);
            if(a==1){
                array[i]="Gold Medal";
            }
            else if(a==2){
                array[i]="Silver Medal";
            }
            else if(a==3){
                array[i]="Bronze Medal";
            }
            else{
                array[i]=String.valueOf(a);
            }
            
        }return array;
    }
}