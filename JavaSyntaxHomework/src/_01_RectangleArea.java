import java.util.Scanner;

public class _01_RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] splitInput = input.nextLine().split(" ");
        
        int pointA = Integer.parseInt(splitInput[0]);
        int pointB =  Integer.parseInt(splitInput[1]);

        int area = pointA * pointB;
        System.out.println(area);
    }
}
