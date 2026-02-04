package CoreJava;

public class subString {
    static void main() {
        String s = "abcde";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=n; j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
