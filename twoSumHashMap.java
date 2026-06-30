
import java.util.*;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             int compliment = target - nums[i];
//             if (map.containsKey(compliment)) {
//                 return new int[]{map.get(compliment), i};
//             }
//             map.put(nums[i], i);
//         }
//         return new int[]{};
//     }
// }
public class twoSumHashMap {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = s.twoSum(new int[]{1, 2, 3, 4, 5}, 8);
        System.out.println("Output: " + Arrays.toString(arr));
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
