package extensions.leetcode.algo;


/**
 * @Description:
 * @Author: Davis
 * @Date: Created in 16:11 2020/12/13
 * @Modified By: Davis
 */

public class ArrayExtension {
    public static String ToText(int[] numbs){
        StringBuilder result = new StringBuilder();
        for (int numb : numbs) {
            result.append(numb).append(",");
        }
        return result.toString();
    }
}
