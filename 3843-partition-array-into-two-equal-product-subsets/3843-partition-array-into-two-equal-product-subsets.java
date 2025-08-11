import java.math.BigInteger;
class Solution {

    static boolean func(int[]nums,BigInteger target,int i,BigInteger prod){
        if(i==nums.length){
            return prod.equals(target);
        }
        if(prod.compareTo(target)>0){
            return false;
        }
        //pick ele
        if(func(nums,target,i+1,prod.multiply(BigInteger.valueOf(nums[i])))){
            return true;
        }return func(nums,target,i+1,prod);
    }
    public boolean checkEqualPartitions(int[] nums, long target) {
        BigInteger total=BigInteger.valueOf(1);
        for(int i=0;i<nums.length;i++){
            total=total.multiply(BigInteger.valueOf(nums[i]));
        }
        BigInteger tar_squ=BigInteger.valueOf(target).multiply(BigInteger.valueOf(target));
        if(!total.equals(tar_squ)){
            return false;
        }return func(nums,BigInteger.valueOf(target),0,BigInteger.valueOf(1));
    }
}