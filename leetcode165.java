/*The approach here is simple: I scan through the entire string once and keep track of how many times each character appears using a frequency array. After that, I just count how many characters occur an odd number of times because, for a string to be rearranged into a palindrome, at most one character can have an odd frequency. If more than one character has an odd count, it’s impossible; otherwise, it’s possible. This way, I can quickly and efficiently check the condition without needing to try building the palindrome itself.*/



package com.java.leetcode;

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int length = Math.max(v1.length, v2.length);

        for (int i = 0; i < length; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }
        return 0;
    }
}

public class leetcode165 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.compareVersion("1.01", "1.001")); // 0
        System.out.println(sol.compareVersion("1.0", "1.0.0")); // 0
        System.out.println(sol.compareVersion("0.1", "1.1"));   // -1
        System.out.println(sol.compareVersion("1.2", "1.10"));  // -1
        System.out.println(sol.compareVersion("2.0", "1.9"));   // 1
    }
}
