public class Triangle {

    public static void main(String[] args) {

        int n = 5;
        String s = "* ";

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(s.repeat(i));
            }
        }
    }
}
        
