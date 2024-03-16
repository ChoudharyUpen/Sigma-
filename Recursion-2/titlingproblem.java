public class tilingproblem {
    // method for solving tiling problem and using recursion
    public static int tittlingproblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical ways
        int fnm1 = tittlingproblem(n - 1);
        // horizontal ways
        int fnm2 = tittlingproblem(n - 2);
        return fnm1 + fnm2;
    }
    // main method
    public static void main(String[] args) {
        System.out.println(tittlingproblem(3));
    }
}
