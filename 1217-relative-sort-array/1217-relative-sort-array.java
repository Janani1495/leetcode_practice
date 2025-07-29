class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[]arr=new int[arr1.length];int k=0;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    list.add(arr1[j]);
                }
            }
        }List<Integer>list1=new ArrayList<>();
        if(list.size()!=arr1.length){
            for(int i=0;i<arr1.length;i++){
                if(!list.contains(arr1[i])){
                    list1.add(arr1[i]);
                }
            }

        }Collections.sort(list1);
        for(int i=0;i<list.size();i++){
               arr[i]=list.get(i);k++;
        }
        for(int i=0;i<list1.size();i++){
            arr[k++]=list1.get(i);
        }
        return arr;
    }
}