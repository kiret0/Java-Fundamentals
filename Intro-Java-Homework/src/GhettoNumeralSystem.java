import java.util.ArrayList;
import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        int index = number.charAt(1);
        String[] word = {"Gre","Bro","Zuz","Ma","Duh","Yo","Dis","Hood","Jam","Mack"};
        String resultWord = "";
        for(int i = 0; i < number.length(); i++){

            resultWord += word[Integer.parseInt(Character.toString(number.charAt(i)))];
        }
        System.out.println(resultWord);

    }
}
