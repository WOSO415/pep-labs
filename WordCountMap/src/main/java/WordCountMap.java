
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){

        if (words == null || words.length() == 0) {
            // If the input string is empty or null, return an empty map
            return new HashMap<>();
        }
        String[] tokens = words.split("\\s+"); // Split the input string into individual words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String token : tokens) {
            if (!wordMap.containsKey(token)) {
                // If the word is not already in the map, add it with a frequency of 1
                wordMap.put(token, 1);
            } else {
                // If the word is already in the map, increment its frequency by 1
                wordMap.put(token, wordMap.get(token) + 1);
            }
        }
        return wordMap;
    }
}
