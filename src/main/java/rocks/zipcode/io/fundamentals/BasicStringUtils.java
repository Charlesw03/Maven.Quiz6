package rocks.zipcode.io.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        String retval = new String(chars);

        return retval;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        String str = "";
        for (Character c : chars) {
            str += c.toString();
        }

        return str;
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        List<Character> vowList = Arrays.asList(vowels);

        StringBuffer sbuf = new StringBuffer(string);
        for (int i = 0; i < sbuf.length(); i++) {
            if (vowList.contains(sbuf.charAt(i))) {
                sbuf.replace(i, i + 1, "");
                i--;
            }
        }

        return sbuf.toString();
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        StringBuilder sb = new StringBuilder();
        for (char c: string.toCharArray() ) {
                if(charactersToRemove.indexOf(c)== -1){
                    sb.append(c);
                }
        }


        return sb.toString();
    }
}
