class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
           if(divide(num)){
            list.add(i);
           }
           
        }return list;
    }
    public boolean divide(int num){
        int i=num;
       
        while(num!=0){
            int dig=num%10;
            if(dig==0)return false;
            if(dig!=0){
            if(i%dig!=0){
                return false;
            }
            }num/=10;
        }return true;
    }
}