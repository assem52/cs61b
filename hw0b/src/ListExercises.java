import java.util.ArrayList;
import java.util.List;
/**************DONE BY Eng: Assem With all love ************/
public class ListExercises {

    /**
     * Returns the total sum in a list of integers
     */
    public static int sum(List<Integer> L) {
        int sum = 0;
        for (int i = 0; i < L.size(); i++) {
            sum += L.get(i);
        }
        return sum;
    }

    /**
     * Returns a list containing the even numbers of the given list
     */
    public static List<Integer> evens(List<Integer> L) {
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int i = 0; i < L.size(); i++) {
            if (L.get(i) % 2 == 0) {
                evenNums.add(L.get(i));
            }
        }
        return evenNums;
    }

    /**
     * Returns a list containing the common item of the two given lists
     */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        ArrayList<Integer> common = new ArrayList<>();
        for (Integer item : L1) {
            for (Integer item2 : L2) {
                if (item == item2 && !common.contains(item)) {
                    common.add(item2);
                }
            }
        }
        return common;
    }


    /**
     * Returns the number of occurrences of the given character in a list of strings.
     */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == c) {
                    count++;
                }
            }
        }
        return count;
    }
}