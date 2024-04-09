package blind75.arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;
// 271. Encode & Decode Strings
public class encodeAndDecode {

    public static String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length());
            sb.append("-");
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '-') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            System.out.println(str.substring(j + 1, j + 1 + length));
            result.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return result;
    }

}
