import java.util.Scanner;

public class _03_FormattingNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());

        String hex = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toString(a, 2);

        double b = Double.parseDouble(input.nextLine());
        double c = Double.parseDouble(input.nextLine());

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hex, Integer.parseInt(binary),b,c);

    }
}
