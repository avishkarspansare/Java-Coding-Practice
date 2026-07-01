
public class Avi {

    public static void main(String[] args) {
        //     int n = 1634;
        //     int temp = n, sum = 0;
        //     while (n > 0) {
        //         int digit = n % 10;
        //         sum = sum + (digit * digit * digit * digit);
        //         n /= 10;
        //     }
        //     System.out.println((sum == temp) ? (temp + " is an Amstrong Number") : (temp + " is not an Amstrong Number"));

        // int n = 1011;
        // int temp = n, rev = 0;
        // while (n != 0) {
        //     rev = rev * 10 + n % 10;
        //     n /= 10;
        // }
        // System.out.println((temp == rev) ? "palindrome" : "Not Palindrome");
        //
        // String s = "Avi";
        // String rev = new StringBuilder(s).reverse().toString();
        // System.out.println((s.equals(rev) ? "Palindrome" : "Not a Palindrome"));
        //
        // String s = "AvA";
        // String rev = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     rev += s.charAt(i);
        // }
        // System.out.println((s.equals(rev)) ? "palindrome" : "Not a Palindrome");
        //
        // int n = 6;
        // boolean isPrime = true;
        // if (n <= 1) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             isPrime = false;
        //         }
        //     }
        // }
        // System.out.println((isPrime) ? "Prime" : "Not Prime");
        //
        // int a = 153;
        // int temp = a, sum = 0;
        // while (a > 0) {
        //     int digit = a % 10;
        //     sum = sum + (digit * digit * digit);
        //     a /= 10;
        // }
        // System.out.println((sum == temp) ? "Amstrong" : "Not Amstrong");
        //
        // Solution s = new Solution();
        // int[] arr = s.twoSum(new int[]{1,2,3,4,5}, 8);
        // System.out.println(Arrays.toString(arr));
        //
        // String a = "Hello";
        // String b = new String("Hello");
        // System.out.println((a.equals(b)) ? "equal" : "not equal");
        //
        // int n = 8;
        // int a = 0, b = 1;
        // for (int i = 1; i < n; i++) {
        //     System.out.println(a + " ");
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             int compliment = target - nums[i];
//             if(map.containsKey(compliment)) {
//                 return new int[]{map.get(compliment), i};
//             }
//             map.put(nums[i], i);
//         }
//         return new int[]{};
//     }
// }
// SELECT DISTINCT salary FROM employee ORDER BY salary DESC LIMIT 1 OFFSET 1;
// SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT 1 OFFSET 1;
// SELECT e.emp_id, e.name, d.dept_name FROM Employee e INNER JOIN Department d ON e.dept_id = d.dept_id;
// SELECT e.eid, e.name, d.dept_name FROM Employee e INNER JOIN Department d ON e.dept_id = d.dept_id;
// SELECT e.eid, e.name, d.dept_name FROM Employee e INNER JOIN Department d ON e.dept_id = d.dept_id;

