
public class AssignVariables {
    public static void main(String[] args){
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = 2000000000;
        long longVariable = 919827112351L;
        char charVariable = 'c';
        boolean boolVariable = false;
        float floatVariable = 0.5f;
        double doubleVariable = 0.1234567891011;
        String name;
        name = "Palo Alto";
        System.out.println(String.format("Byte: %d \nShort: %d \nInt: %d \nLong: %d \nChar: %c \nBoolean: %b \nFloat: %.1f \nDouble: %.13f \nString: %s"
                ,byteVariable,shortVariable,intVariable,longVariable,charVariable,boolVariable,floatVariable,doubleVariable,name));
    }
}
