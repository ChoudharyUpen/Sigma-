public class largeststring {
    public static void ls(String a, String b) {
        for (int i = 1; i < 5; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                System.out.println("Yes Equal");
                return;
            } else {
                System.out.println("Not Equal");
                return;
            }
        }

    }
//prove equalsion lexographically
    public static void main(String[] args) {
        String a = "apple";
        String b = "banna";

        ls(a, b);

    }
}
