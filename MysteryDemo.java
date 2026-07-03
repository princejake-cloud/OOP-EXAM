public class MysteryDemo {
    static int mystery() {
        try {
            System.out.println("A");
            return 1;
        } catch (Exception e) {
            System.out.println("B");
            return 2;
        } finally {
            System.out.println("C");
            return 3;
        }
    }

    static int risky(int x) {
        try {
            if (x == 0) throw new ArithmeticException();
            return 10 / x;
        } catch (ArithmeticException e) {
            System.out.println("caught");
            return -1;
        } finally {
            System.out.println("done");
        }
    }

    public static void main(String[] args) {
        System.out.println("mystery() returns: " + mystery());
        System.out.println("risky(0) returns: " + risky(0));
        System.out.println("risky(2) returns: " + risky(2));
    }
}
