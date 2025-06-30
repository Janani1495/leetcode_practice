class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[]arr=s.split(" ");
        if(arr.length!=pattern.length())return false;
        Map<Character,String>chart=new HashMap<>();
        Map<String,Character>str=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            char c=pattern.charAt(i);
            if(chart.containsKey(c)){
                if(!chart.get(c).equals(word))return false;}
            else{
                    chart.put(c,word);
                }
            
            if(str.containsKey(word)){
                if(!str.get(word).equals(c))return false;}
            else
                str.put(word,c);
            
        }return true;
    }
}