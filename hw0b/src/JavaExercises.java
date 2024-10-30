import java.util.ArrayList;
import java.util.List;
/**************DONE BY Eng: Assem With all love ************/
public class JavaExercises {

    /**
     * Returns an array [1, 2, 3, 4, 5, 6]
     */
    public static int[] makeDice() {
        int[] arr;
        arr = new int[]{1, 2, 3, 4, 5, 6};
        return arr;
    }


    /**
     * Returns the order depending on the customer.
     * If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     * If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     * In any other case, return an empty String[] of size 3.
     */
    public static String[] takeOrder(String cusName) {
        String[] res;

        if (cusName.equals("Ergun")) {

            res = new String[]{"beyti", "pizza", "hamburger", "tea"};

        } else if (cusName.equals("Erik")) {

            res = new String[]{"sushi", "pasta", "avocado", "coffee"};

        } else {

            res = new String[]{"", "", ""};

        }
        return res;
    }


    /**
     * Returns the positive difference between the maximum element and minimum element of the given array.
     * Assumes array is nonempty.
     */
    public static int findMinMax(int[] arraOfInt) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arraOfInt.length; i++) {

            if (arraOfInt[i] < min) {
                min = arraOfInt[i];
            }
            if (arraOfInt[i] > max) {
                max = arraOfInt[i];
            }
        }
        return max - min;

    }


    /**
     * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
     * Hailstone sequence is described as:
     * - Pick a positive integer n as the start
     * - If n is even, divide n by 2
     * - If n is odd, multiply n by 3 and add 1
     * - Continue this process until n is 1
     */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {

        list.add(x);
        if (x == 1) {
            return list;
        } else {
            if (x % 2 == 0) {
                return hailstoneHelper(x / 2, list);
            } else {
                return (hailstoneHelper(x * 3 + 1, list));
            }
        }

    }
}
