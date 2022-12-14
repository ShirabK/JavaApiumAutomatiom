package IntroductionToJavaAndJUnit.Les0;

public class MathHelper {

    public int simple_int = 7;
    public static int static_int = 7;

    public MathHelper() {
    }

    public int calc(int a, int b, char action) {
        if (action == '+') {
            return this.plus(a, b);
        } else if (action == '-') {
            return this.minus(a, b);
        } else if (action == '*') {
            return this.mulpiply(a, b);
        } else {
            return action == '/' ? this.divide(a, b) : this.typeAnErrorAndReturnDefaultValue("wrong action: " + action);
        }
    }

    private int typeAnErrorAndReturnDefaultValue(String error_message) {
        System.out.println(error_message);
        return 0;
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int number, int divider) {
        return divider == 0 ? this.typeAnErrorAndReturnDefaultValue("Cannot divide by zero") : number / divider;
    }

    public int multiply(int number) {
        return number * 2;
    }

    public int mulpiply(int number, int multiply) {
        return number * multiply;
    }
}
