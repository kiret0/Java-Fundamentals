import java.util.*;

public class _07_RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        
        int minimum = Math.min(firstNum,secondNum);
        int maximum = Math.max(secondNum,firstNum);
        
        Random rn = new Random();
        int range = maximum - minimum + 1;

        Set<Integer> generated = new LinkedHashSet<>();
        while(generated.size() < range) {
            int randomNum = rn.nextInt(range) + minimum;
            generated.add(randomNum);

        }
        generated.forEach(p -> System.out.println(p));
    }
}
