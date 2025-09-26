/*This code counts the number of valid triangles in an array, where a triangle is valid 
if the sum of any two sides is greater than the third. It first sorts the array to ensure
nums[i] ≤ nums[j] ≤ nums[k], then fixes the largest side nums[k] and uses a two-pointer 
approach (i at start, j just before k) to find all pairs (i, j) such that nums[i] + nums[j] > nums[k].
Whenever this condition is true, all elements between i and j form valid triangles, so (j - i) 
is added to the count. If the sum is too small, i is incremented; otherwise, j is decremented. 
After processing all k, the total count gives the number of valid triangles, with O(n²) time and O(1) extra space.*/

import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        if (nums.length < 3) return 0;

        Arrays.sort(nums);
        int count = 0;

        for (int k = 2; k < nums.length; k++) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i); 
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 2, 3, 4};
        System.out.println(sol.triangleNumber(nums)); // Output: 3
    }
}
