class Solution {
    public int maxRepeating(String sequence, String word) {
     /*   int count=0;
        int size=word.length();
        for(int i=0;i<sequence.length();i++){
            String s="";
            if((size+i)<=sequence.length()){
             s=sequence.substring(i,size+i);
            }System.out.print(s+" ");
             if(s.equals(word)){
                count++;
             }
            

        }return count;*/
        StringBuilder sb=new StringBuilder(word);
        int count=0;
        while(sequence.contains(sb.toString())){
            sb.append(word);
            count++;
        }return count;
    }
}