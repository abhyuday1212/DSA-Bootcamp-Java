
import java.util.*;

public class solution1 {

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        // Copy elements from nums to ans
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }

        // Copy elements from nums to ans again

        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = getConcatenation(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

}
