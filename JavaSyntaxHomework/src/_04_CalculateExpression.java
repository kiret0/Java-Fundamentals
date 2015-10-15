import java.util.Scanner;

public class _04_CalculateExpression {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double valueA = Double.parseDouble(input.nextLine());
        double valueB = Double.parseDouble(input.nextLine());
        double valueC = Double.parseDouble(input.nextLine());

        double resultByFormulaOne = calculateWithFormulaOne(valueA,valueB,valueC);
        double resultByFormulaTwo = calculateWithFormulaTwo(valueA, valueB, valueC);

        double averageOne = (resultByFormulaOne + resultByFormulaTwo)/2;
        double averageTwo = (valueA + valueB + valueC) /3;
        double diff = averageOne - averageTwo;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",resultByFormulaOne,resultByFormulaTwo,diff);
    }

    public static double calculateWithFormulaOne(double a, double b, double c) {

        double returnValue = Math.pow(((Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2))),(a + b + c)/Math.sqrt(c));
        return returnValue;
    }
    public static double calculateWithFormulaTwo(double a, double b, double c){
        double returnValue = Math.pow(((Math.pow(a,2)+ Math.pow(b,2))-Math.pow(c,3)),(a-b));
        return returnValue;
    }
}
