import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        char symbol = 'a';
        int count = 1;
        while(count < number){
            for(int i = 0; i < count; i++){
                System.out.print( symbol+ " ");
                symbol++;
            }
            System.out.println();
            count++;
            symbol = 'a';
        }
        while(count >= 0){
            for(int i = 0; i < count; i++){
                System.out.print( symbol+ " ");
                symbol++;
            }
            System.out.println();
            count--;
            symbol = 'a';
        }
    }
}
