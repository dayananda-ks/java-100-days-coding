class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        int num = 0;

        // it will traverse untill end of the whitespace...
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // if we get a '-' or '+' first index the sign will store the negative...
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // in this step if the value is digit the loop will run otherwise  directly go into last step and print 0.
        // is it digit enter into the loop.. and convert char to int 
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // this edge cases solution in have limit of capacity to store a number if it cross overflow happend for prventing that eror we correct it here and digit 7 means it will not goto out of range it prevent it 
            if (num > Integer.MAX_VALUE / 10 ||
               (num == Integer.MAX_VALUE / 10 && digit > 7))
                {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE; // it print max and min value
            }
            // this store the first and  continous digit
            num = num * 10 + digit;
            i++;
        }

        // if not a digit it will print 0
        return sign * num;
    }
}
