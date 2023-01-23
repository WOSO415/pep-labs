import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        List<String> strings = Arrays.asList(arr);
        String longest = strings.stream().max(Comparator.comparingInt(String::length)).get();
        int max = longest.length();
        return longest;
        
    }

}
