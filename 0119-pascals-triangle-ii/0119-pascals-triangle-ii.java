class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>>list=new ArrayList<>();
         int numRows=34;
        for(int i=0;i<numRows;i++){
            List<Integer>l=new ArrayList<>();
          for(int j=0;j<=i;j++){
            if(j==0||j==i)l.add(1);
            else l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
          }list.add(l);
        }List<Integer>l3=new ArrayList<>();
        for(int j=0;j<rowIndex+1;j++){
           l3.add(list.get(rowIndex).get(j));
        }
        return l3;  
    }
}