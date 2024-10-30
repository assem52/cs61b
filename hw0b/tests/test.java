import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        System.out.println(hailStone(20));
    }

    public static ArrayList<Integer> hailStone(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(n); // Add the current value of n

        if (n == 1) {
            return a; // Base case: return the list when n is 1
        } else {
            // Recursive call
            ArrayList<Integer> nextSequence;
            if (n % 2 == 0) {
                nextSequence = hailStone(n / 2); // Even case
            } else {
                nextSequence = hailStone(n * 3 + 1); // Odd case
            }
            a.addAll(nextSequence); // Combine current list with the next sequence
            return a; // Return the complete sequence
        }
    }
}
