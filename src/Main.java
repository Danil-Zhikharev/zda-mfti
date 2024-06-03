import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        System.out.println("Hello world!");
        System.out.println("Результат метода fraction: " + Utils.fraction(5.25));
        System.out.println("Результат метода sumLastNums: " + Utils.sumLastNums(4568));
        System.out.println("Результат метода charToNum: " + Utils.charToNum('3'));
        System.out.println("Результат метода isPositive: " + Utils.isPositive(1));
        System.out.println("Результат метода is2Digits: " + Utils.is2Digits(32));
        System.out.println("Результат метода isUpperCase: " + Utils.isUpperCase('A'));
        System.out.println("Результат метода isInRange: " + Utils.isInRange(15, 2, 16));
        System.out.println("Результат метода isDivisor: " + Utils.isDivisor(11, 2));
        System.out.println("Результат метода isEqual: " + Utils.isEqual(1, 1, 1));
        int res = Utils.lastNumSum(Utils.lastNumSum(Utils.lastNumSum(Utils.lastNumSum(5, 11), 123), 14), 1);
        System.out.println("Результат метода lastNumSum: " + res);
        System.out.println("Результат метода abs: " + Utils.abs(-5));
        System.out.println("Результат метода safeDiv: " + Utils.safeDiv(8, 0));
        System.out.println("Результат метода max: " + Utils.max(8, -10));
        System.out.println("Результат метода makeDecision: " + Utils.makeDecision(8, 10));
        System.out.println("Результат метода max3: " + Utils.max3(1, 1, 7));
        System.out.println("Результат метода sum3: " + Utils.sum3(3, 7, 4));
        System.out.println("Результат метода sum2: " + Utils.sum2(10, -1));
        System.out.println("Результат метода is35: " + Utils.is35(15));
        System.out.println("Результат метода age: " + Utils.age(514));
        System.out.println("Результат метода day: " + Utils.day(10));
        System.out.println("Результат метода printDays:\n" + Utils.printDays("Пятница"));
        System.out.println("Результат метода listNums: " + Utils.listNums(6));
        System.out.println("Результат метода reverseListNums: " + Utils.reverseListNums(6));
        System.out.println("Результат метода chet: " + Utils.chet(7));
        System.out.println("Результат метода pow: " + Utils.pow(5,5));
        System.out.println("Результат метода numLen: " + Utils.numLen(12345));
        System.out.println("Результат метода equalNum: " + Utils.equalNum(11171));
        Utils.square(4);
        Utils.leftTriangle(4);
        Utils.rightTriangle(4);
        System.out.println("Результат метода findFirst: " + Utils.findFirst(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println("Результат метода findLast: " + Utils.findLast(new int[]{1, 2, 3, 5, 5}, 5));
        System.out.println("Результат метода maxAbs: " + Utils.maxAbs(new int[]{1, 2, 3, -8, 5}));
        System.out.println("Результат метода countPositive: " + Utils.countPositive(new int[]{1, 2, 3, -8, 5}));
        System.out.println("Результат метода isPalindrome: " + Utils.isPalindrome(new int[]{1,-2,-7,4,-7,-2,1}));
        Utils.reverse(new int[]{1,2,3,4,5});
        System.out.println("Результат метода reverseBack: " + Arrays.toString(Utils.reverseBack(new int[]{1,2,3,4,5})));
        System.out.println("Результат метода concat: " + Arrays.toString(Utils.concat(new int[]{1,2,3}, new int[]{1,2,3})));
        System.out.println("Результат метода findAllOccurrences: " + Arrays.toString(Utils.findAllOccurrences(new int[]{1,2,3,2,2,7}, 2)));
        System.out.println("Результат метода deleteNegative: " + Arrays.toString(Utils.deleteNegative(new int[]{1,2,-3,-4,5})));
        System.out.println("Результат метода add: " + Arrays.toString(Utils.add(new int[]{1,2,3,4,5}, 9, 3)));
        System.out.println("Результат метода add2: " + Arrays.toString(Utils.add2(new int[]{1,2,3,4,5}, new int[]{7,8,9}, 3)));
    }
}
