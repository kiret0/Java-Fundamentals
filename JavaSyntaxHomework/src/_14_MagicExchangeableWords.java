import java.util.HashMap;
import java.util.Scanner;

public class _14_MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");

        String firstWord = words[0];
        String secondWord = words[1];

        boolean isExchanged = exchangeWords(firstWord,secondWord);


        System.out.println(isExchanged);
    }

    public static boolean exchangeWords(String firstWord,String secondWord) {

        boolean isExchanged = true;
        HashMap<Character,Character> chars = new HashMap<>();

        for (int i = 0; i < firstWord.length(); i++) {
                if(!chars.containsKey(firstWord.charAt(i))){
                    chars.put(firstWord.charAt(i),secondWord.charAt(i));
                }
                else if(chars.get(firstWord.charAt(i)) != secondWord.charAt(i)) {
                    isExchanged = false;
                    break;
                }
            }
        return isExchanged;
    }
}
