package CoreJava;
public class RefinedString {
    static void main() {
        String s = " iNR_750.50 : (Groceries & Toiletries) ";
        String t = " iNR 230 : (Food) ";
        System.out.println(clean(s));
        System.out.println(clean(t));
    }
    public static String clean(String s){
        StringBuilder amount = new StringBuilder();
        StringBuilder category = new StringBuilder();
        boolean foundColon = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!foundColon){
               if(Character.isDigit(c) || c=='.'){
                   amount.append(c);
               } else if (c==':') {
                  foundColon=true;
               }
            }else {
                if(Character.isLetter(c) || c=='&' || c=='/'){
                    category.append(Character.toUpperCase(c));
                }
            }
        }
        return amount.append('-').append(category).toString();
    }
}
