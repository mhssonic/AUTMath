public class AUTMath {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int factorial(int number) {
        return number * factorial(number -1);
    }

    public static int pow(int base, int power) {
        return base * pow(base, power - 1);
    }
}
