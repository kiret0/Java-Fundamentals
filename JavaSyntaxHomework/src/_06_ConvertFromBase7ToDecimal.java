import java.util.Scanner;

public class _06_ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String baseSevanNum = input.nextLine();
        int decimal = Integer.parseInt(baseSevanNum,7);
        System.out.println(decimal);
    }
}
