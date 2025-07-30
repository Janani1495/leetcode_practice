class Solution {
    public int mostWordsFound(String[] sentences) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<sentences.length;i++){
            String[]arr=sentences[i].split(" ");
            list.add(arr.length);
        }int max=0;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }
}