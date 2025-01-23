public class Ltcode003 {
        public int myAtoi(String s) {
            if (s == null || s.isEmpty()) {
                return 0;
            }
    
            // Step 1: Trim leading/trailing whitespace
            s = s.trim();
    
            // Step 2: Check if the string is empty after trimming
            if (s.isEmpty()) {
                return 0;
            }
    
            int sign = 1; // Default sign is positive
            int index = 0; // Pointer to traverse the string
            int n = s.length();
    
            // Step 3: Handle the sign, if present
            if (s.charAt(index) == '-' || s.charAt(index) == '+') {
                sign = (s.charAt(index) == '-') ? -1 : 1;
                index++;
            }
    
            // Step 4: Convert numeric characters to an integer
            int result = 0;
            while (index < n && Character.isDigit(s.charAt(index))) {
                int digit = s.charAt(index) - '0';
    
                // Step 5: Handle overflow/underflow
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
    
                result = result * 10 + digit;
                index++;
            }
    
            return result * sign;
        }
    
        public static void main(String[] args) {
            Ltcode003 converter = new Ltcode003();
    
            // Test cases
            System.out.println(converter.myAtoi("42")); // Output: 42
            System.out.println(converter.myAtoi("   -42")); // Output: -42
            System.out.println(converter.myAtoi("4193 with words")); // Output: 4193
            System.out.println(converter.myAtoi("words and 987")); // Output: 0
            System.out.println(converter.myAtoi("-91283472332")); // Output: -2147483648 (Integer.MIN_VALUE)
    }
    }

