public class Ltcode007 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            ++digits[i];
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Ltcode007 solution = new Ltcode007();
        int[] digits = {9, 9, 8};
        int[] result = solution.plusOne(digits);

        System.out.print("Resulting array after plus one: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
