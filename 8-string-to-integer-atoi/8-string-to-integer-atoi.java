class Solution {
    public int myAtoi(String str) {
            int index = 0, sign = 1, total = 0, n = str.length();
            //1. Remove Spaces
            while (index < n && str.charAt(index) == ' ')
                index++;

            //2. Handle signs
            if (index < n && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
                sign = str.charAt(index++) == '+' ? 1 : -1;
            }

            //3. Convert number and avoid overflow
            while (index < n) {
                int digit = str.charAt(index) - '0';
                if (digit < 0 || digit > 9) break;

                //check if total will be overflow after 10 times and add digit
                if (total > Integer.MAX_VALUE / 10 || total == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < digit)
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

                total = 10 * total + digit;
                index++;
            }

            return total * sign;
        }
}