import java.util.Scanner;

public class _02_TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pointAX = input.nextInt();
        int pointAY =  input.nextInt();

        int pointBX =  input.nextInt();
        int pointBY =  input.nextInt();

        int pointCX =  input.nextInt();
        int pointCY =  input.nextInt();


        int area = Math.abs((pointAX * (pointBY - pointCY) + pointBX * (pointCY - pointAY) + pointCX * (pointAY - pointBY)) /2);
        System.out.println(area);
    }
}
