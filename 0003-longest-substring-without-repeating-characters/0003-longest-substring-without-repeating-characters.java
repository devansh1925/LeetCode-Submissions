class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int left = 0, right = 0, maxlength = 0;
        int[] arr = new int[256];

        // Properly initialize the array
        for (int i = 0; i < 256; i++) {
            arr[i] = -1;
        }

        while (right < n) {
            char ch = s.charAt(right);

            if (arr[ch] != -1 && arr[ch] >= left) {
                left = arr[ch] + 1;
            }

            maxlength = Math.max(maxlength, right - left + 1);
            arr[ch] = right;
            right++;
        }

        return maxlength;
    }
}
