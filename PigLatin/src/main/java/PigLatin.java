
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        String ans = "";
        for (int i = 0; i < in.length(); i++) {
            int j = i;
            if (i >= in.length())
                break;
            while (i < in.length() && in.charAt(i) != ' ')
                i++;
            if (ans.isEmpty()) {
                ans = ans.concat(
                    in.substring(j + 1, i)
                    + in.charAt(j) + "ay");
            }
            else {
                ans = ans.concat(
                    " " + in.substring(j + 1, i)
                    + in.charAt(j) + "ay");
            }
        }
        return ans;
    }
   
}

