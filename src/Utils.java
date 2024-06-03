import java.util.Arrays;

public class Utils {

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

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }


    public static void tableX2(String[] args) {
        int x = Integer.parseInt(args[0]);
        for (int i = 1; i <= 10; i++) {
            int result = i * x;

            System.out.println(i + " * " + x + " = " + result);
        }
    }

    public static int abs(int x) {
        if (x < 0) {
            return Math.abs(x);
        }
        return x;
    }

    public static int safeDiv(int x, int y) {
        return (y != 0) ? x / y : 0;
    }

    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    public static String makeDecision(int x, int y) {
        if (x == y) {
            return x + " == " + y;
        }

        return Math.max(x, y) + " > " + Math.min(x, y);
    }

    public static int max3(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public static int sum2(int x, int y) {
        int sum = x + y;
        return (sum > 19 || sum < 10) ? sum : 20;
    }

    public static boolean is35(int x) {
        boolean firstCheck = x % 3 == 0;
        boolean secondCheck = x % 5 == 0;

        return (firstCheck || secondCheck) && !(firstCheck && secondCheck);
    }

    public static String age(int x) {
        if (x % 10 == 1 && x % 100 != 11) {
            return x + " год";
        }
        if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && !(x % 100 >= 11 && x % 100 <= 14)) {
            return x + " годa";
        }
        return x + " лет";
    }

    public static String day(int x) {
        String res = "";
        switch (x) {
            case 1:
                res = "понедельник";
                break;
            case 2:
                res = "вторник";
                break;
            case 3:
                res = "среда";
                break;
            case 4:
                res = "четверг";
                break;
            case 5:
                res = "пятница";
                break;
            case 6:
                res = "суббота";
                break;
            case 7:
                res = "воскресенье";
                break;
            default:
                res = "это не день недели";
                break;
        }
        return res;
    }

    public static String printDays(String x) {
        String res = "";

        switch (x.toLowerCase()) {
            case "понедельник":
                res += "понедельник\n";
            case "вторник":
                res += "вторник\n";
            case "среда":
                res += "среда\n";
            case "четверг":
                res += "четверг\n";
            case "пятница":
                res += "пятница\n";
            case "суббота":
                res += "суббота\n";
            case "воскресенье":
                res += "воскресенье\n";
                break;
            default:
                res = "это не день недели";
                break;
        }

        return res.trim();
    }

    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res += i;
            if (i < x) {
                res += " ";
            }
        }
        return res;
    }

    public static String reverseListNums(int x) {
        String res = "";
        for (int i = x; i >= 0; i--) {
            res += i;
            if (i > 0) {
                res += " ";
            }
        }
        return res;
    }

    public static String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res += i;
            if (i < x) {
                res += " ";
            }
        }
        return res;
    }

    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static int numLen(long x) {
        String numStr = String.valueOf(x);
        int res = numStr.length();

        return res;
    }

    public static boolean equalNum(int x) {
        String numStr = String.valueOf(x);
        char firstChar = numStr.charAt(0);
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }

    public static void square(int x) {
        System.out.print("Результат метода square: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftTriangle(int x) {
        System.out.print("Результат метода leftTriangle: \n");
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void rightTriangle(int x) {
        System.out.print("Результат метода rightTriangle: \n");
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int findLast(int[] arr, int x) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static int maxAbs(int[] arr) {
        int maxAbsValue = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int absValue = Math.abs(arr[i]);

            if (absValue > maxAbsValue) {
                maxAbsValue = absValue;
                res = arr[i];
            }
        }
        return res;
    }

    public static int countPositive(int[] arr) {
        int positiveCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            }
        }
        return positiveCount;
    }

    public static boolean isPalindrome(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {
            if (arr[i] != arr[size - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void reverse(int[] arr) {

        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        System.out.println("Результат метода reverse: " + Arrays.toString(arr));
    }

    public static int[] reverseBack(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        return arr;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        return newArr;
    }

    public static int[] findAllOccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        int[] indexArr = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indexArr[index++] = i;
            }
        }

        return indexArr;
    }

    public static int[] deleteNegative(int[] arr) {
        int positiveCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            }
        }
        int[] newArr = new int[positiveCount];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    public static int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static int[] add2(int[] arr, int[] ins, int pos) {
        int[] newArr = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            newArr[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            newArr[i + ins.length] = arr[i];
        }

        return newArr;
    }
}
