class Solution {
    public int alternateDigitSum(int n) {
        List<Integer>list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }Collections.reverse(list);
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                l.add(list.get(i));
            }
            else{
                l.add(-1*list.get(i));
            }
        }int sum=0;
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        return sum;
    }
}