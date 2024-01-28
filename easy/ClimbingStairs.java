package easy;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int one_back = 2;
        int two_back = 1;
        int curr = 0;
        for (int i = 2; i < n; i++) {
            curr = one_back + two_back;
            two_back = one_back;
            one_back = curr;
        }
        return curr;
    }

}
