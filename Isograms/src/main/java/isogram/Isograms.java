package isogram;

import java.util.HashSet;
import java.util.Set;

public class Isograms {

    public static boolean isIsogram(String str) {
        Set<Character> chars = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!chars.add(Character.toLowerCase(c))) {
                return false;
            }
        }
        return true;
    }
}
