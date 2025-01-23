public class Ltcode002{
    public int reverse(int x) {
        int ans = 0;
        for (; x != 0; x /= 10) {
            if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ans = ans * 10 + x % 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Ltcode002 solution = new Ltcode002();
        int number = 123; // Test case
        int reversed = solution.reverse(number);
        System.out.println("Reversed: " + reversed);
    }
}
