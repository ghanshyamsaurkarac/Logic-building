 class Pattern1 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String line = "";

            for (int j = 1; j <= i; j++) {
                line = line + i;

                if (j != i) {
             line = line + "*";
                }
            }
            System.out.println(line);
        }
        for (int i = n - 1; i >= 2; i--) {
            String line = "";

            for (int j = 1; j <= i; j++) {
                line = line + i;

                if (j != i) {
                    line = line + "*";
                }
            }
            System.out.println(line);
        }
    }
}