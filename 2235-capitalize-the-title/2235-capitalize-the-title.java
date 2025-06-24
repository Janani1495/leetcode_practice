class Solution {
    public String capitalizeTitle(String title) {
        String[]arr=title.split(" ");
        String result="";
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(word.length()>2){
            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";}
            else{
                result+=word.toLowerCase()+" ";
            }
        }return result.trim();
    }
}