package patterns.arrays_and_hashing;
// 238. Product of Array Except Self
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++){
            output[i] = prefix;
            prefix *= nums[i];
        }


        int postfix = 1;
        for (int j = nums.length - 1; j >= 0; j--){
            output[j] *= postfix;
            postfix *= nums[j];
        }

        return output;
    }
}
