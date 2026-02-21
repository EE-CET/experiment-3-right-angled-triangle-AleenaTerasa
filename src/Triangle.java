public class Triangle {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {

                for (int j = 1; j <= i; j++) {
                    if (j == i)
                        System.out.print("*");
                    else
                        System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}
