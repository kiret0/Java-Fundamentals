import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10_ExtractWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        Pattern pattern = Pattern.compile("([A-Za-z]+)");
        Matcher matches = pattern.matcher(text);

        ArrayList<String> lastWords = new ArrayList<>();
        while(matches.find()){
            lastWords.add(matches.group(1));
        }
        lastWords.forEach(w -> System.out.print(w + " "));
    }
}
