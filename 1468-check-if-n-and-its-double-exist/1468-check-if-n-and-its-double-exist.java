class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            int num=arr[i]*2;
            
            if(list.contains(num) ){
                if (list.indexOf(num) != i){
                return true;
                }
            }
        }return false;
    }
}