public class recursionexp {
    public static void main(String[] args) {
        naturalnum(1);

    }

    static void naturalnum(int n) {
        if (n == 10) {
            System.out.println(10);

        } else {
            System.out.println(n);
            naturalnum(n+1);
        }
    }

}
