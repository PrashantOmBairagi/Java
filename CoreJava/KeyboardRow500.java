package CoreJava;
import java.util.*;

public class KeyboardRow500 {

    public static char helper(char index){
        index = Character.toLowerCase(index);

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for(char ch : row1.toCharArray()){
            if(ch == index){
                return 'p';
            }
        }

        for(char ch : row2.toCharArray()){
            if(ch == index){
                return 'q';
            }
        }

        for(char ch : row3.toCharArray()){
            if(ch == index){
                return 'r';
            }
        }

        return index;
    }

    public static String[] findWords(String[] words){

        List<String> result = new ArrayList<>();

        for(String word : words){

            char row = helper(word.charAt(0));
            boolean flag = true;

            for(int i = 1; i < word.length(); i++){
                if(helper(word.charAt(i)) != row){
                    flag = false;
                    break;
                }
            }

            if(flag){
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String[] s = {"Hello","Alaska","Dad","Peace"};

        String[] words = findWords(s);

        for(String word : words){
            System.out.println(word);
        }
    }
}