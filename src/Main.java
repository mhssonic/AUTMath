

public class Main {

    public void assertResult(int testing, int expected) {
        if (testing != expected) {
            System.out.printf("\nAssertionError: %d != %d\n");
        } else {
            System.out.print('.');
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}