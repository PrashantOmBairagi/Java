package CoreJava.HashMaps;
import java.util.HashMap;

public class Anagram242 {
    static void main() {
        String a = "anagram";
        String b = "nagaaam";
        System.out.println(isAnagram(a,b));
    }
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
           char c = a.charAt(i);
           if (map.containsKey(c)) {
               map.put(c, map.get(c) + 1);
           } else map.put(c, 1);
           char c2 = b.charAt(i);
           if (map2.containsKey(c2)) {
               map2.put(c2, map2.get(c2) + 1);
           } else map2.put(c2, 1);
        }
        if (map.size() != map2.size()) return false;

        for (Character key : map.keySet()) {
            if (!map.containsKey(key) || !map.get(key).equals(map2.get(key))) {
                return false;
            }
        }

        return true;
    }
}
