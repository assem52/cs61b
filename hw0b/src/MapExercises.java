import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**************DONE BY Eng: Assem With all love ************/
public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 1; i <= 26; i++){
            map.put((char) ('a' + i - 1), i);        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer item : nums){
            map.put(item, item*item);
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String , Integer> map = new HashMap<>();
        for (String word : words){
            int count = 0;
            for (int i = 0; i < words.size(); i++){
                if (words.get(i).equals(word)){
                    count++;
                }
            }
            map.put(word, count);
        }
        return map;
    }
}
