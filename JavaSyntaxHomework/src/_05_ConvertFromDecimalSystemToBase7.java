import java.util.Scanner;

public class _05_ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        String base7 = Integer.toString(decimal,7);

        System.out.println(base7);
    }
}
