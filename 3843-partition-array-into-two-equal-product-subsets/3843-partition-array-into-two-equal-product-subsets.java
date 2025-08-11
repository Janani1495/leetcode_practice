import java.math.BigInteger;

class Solution {

    static boolean rec(int[] arr, BigInteger target, int i, BigInteger product) {
        
        if (i == arr.length) {
            return product.equals(target);
        }

       
        if (product.compareTo(target) > 0) {
            return false;
        }

        if (rec(arr, target, i + 1, product.multiply(BigInteger.valueOf(arr[i])))) {
            return true;
        }

        
        return rec(arr, target, i + 1, product);
    }

    public boolean checkEqualPartitions(int[] nums, long target) {
        BigInteger total = BigInteger.ONE;

      
        for (int num : nums) {
            total = total.multiply(BigInteger.valueOf(num));
        }

        BigInteger targetSquared = BigInteger.valueOf(target).multiply(BigInteger.valueOf(target));

       
        if (!total.equals(targetSquared)) {
            return false;
        }

     
        return rec(nums, BigInteger.valueOf(target), 0, BigInteger.ONE);
    }
}
