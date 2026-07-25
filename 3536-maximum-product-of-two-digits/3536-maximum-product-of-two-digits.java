class Solution {
    public int maxProduct(int num) {
        
        int[] digits = String.valueOf(num)
                             .chars()
                             .map(c -> c - '0')
                             .toArray();
        int n = digits.length;
        Arrays.sort(digits);
        return digits[n-1]*digits[n-2];
    }
}