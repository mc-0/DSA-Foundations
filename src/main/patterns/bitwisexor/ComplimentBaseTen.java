package main.patterns.bitwisexor;
/*
1009. Complement of Base 10 Integer
Time: O(b) where ‘b’ is the number of bits required to store the given number.
Space: O(1)
*/
public class ComplimentBaseTen {
    public static int bitwiseComplement(int num) {
        // count number of total bits in 'num'
        int bitCount = 0;
        int n = num;
        while (n > 0) {
            bitCount++;
            n = n >> 1;
        }

        // for a number which is a complete power of '2' i.e., it can be written as
        // pow(2, n), if we subtract '1' from such a number, we get a number which has 'n'
        // least significant bits set to '1'. For example, '4' which is a complete power of
        // '2', and '3' (which is one less than 4) has a binary representation of '11' i.e.,
        // it has '2' least significant bits set to '1'
        int all_bits_set = (int) Math.pow(2, bitCount) - 1;

        // from the solution description: complement = number ^ all_bits_set
        return num ^ all_bits_set;
    }
}
