public class Main {
    public static void main(String[] arg) {
        System.out.println("Hello world!");
        System.out.println("Результат метода fraction: " + fraction(5.25));
        System.out.println("Результат метода sumLastNums: " + sumLastNums(4568));
        System.out.println("Результат метода charToNum: " + charToNum('3'));
        System.out.println("Результат метода isPositive: " + isPositive(1));
        System.out.println("Результат метода is2Digits: " + is2Digits(32));
        System.out.println("Результат метода isUpperCase: " + isUpperCase('A'));
        System.out.println("Результат метода isInRange: " + isInRange(15, 2, 16));
        System.out.println("Результат метода isDivisor: " + isDivisor(11, 2));
        System.out.println("Результат метода isEqual: " + isEqual(1, 1, 1));
        int res = lastNumSum(lastNumSum(lastNumSum(lastNumSum(5, 11), 123), 14), 1);
        System.out.println("Результат метода lastNumSum: " + res);

    }

    public static double fraction(double x) {
        long y = (long) x;
        double res = x - y;
        return res;
    }

    public static int sumLastNums(int x) {
        x = Math.abs(x);
        int lastСar = x % 10;
        int secondLastCar = (x / 10) % 10;
        int res = lastСar + secondLastCar;
        return res;
    }

    public static int charToNum(char x) {
        return x - '0';
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean is2Digits(int x) {
        return x > 9 || x < -9;
    }

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static boolean isInRange(int a, int b, int num) {
        if (a > b) {
            int replaced = a;
            a = b;
            b = replaced;
        }
        return num >= a && num <= b;
    }

    public static boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}
