package IntroductionToJavaAndJUnit.Les0;


import org.junit.Test;

public class MainTest extends  CoreTestCase{

    int a = 10;
    int b = 11;

    public MainTest() {
    }

    @Test
    public void myFirsTest() {
        System.out.println("Hello мир");
    }

    @Test
    public void typeData() {
        int a = 10;
        System.out.println(a);
        int b = 25;
        System.out.println(b);
        double c = 0.6666666666666666;
        System.out.println(c);
        int d = 10;
        int e = 15;
        if (d > e) {
            System.out.println("never happen");
        } else {
            System.out.println("what will happen");
        }

    }

    @Test
    public void FieldsAndMethods() {
        int a = 99;
        int b = 89;
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(this.b);
        this.typeString();
    }

    public void typeString() {
        System.out.println("hello from methods typeString");
    }

    @Test
    public void FieldsAndMethods2() {
        int a = this.giveMeInt();
        if (a > 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public int giveMeInt() {
        return 5;
    }

    @Test
    public void FieldsAndMethods3() {
        int a = this.multiply(6);
        if (a == 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int b = this.multiply2(10, 29);
        System.out.println(b);
    }

    public int multiply(int number) {
        return number * 10;
    }

    public int multiply2(int number, int multyply) {
        return number * multyply;
    }

    @Test
    public void StaticMethodsAndField() {
        System.out.println("First test: Before changing static_int " + MathHelper.static_int);
        MathHelper.static_int = 8;
        MathHelper mathObject = new MathHelper();
        System.out.println("First test: Before changes simple_int: " + mathObject.simple_int);
        mathObject.simple_int = 8;
    }

    @Test
    public void StaticMethodsAndField2() {
        System.out.println("Second test: Before changing static_int " + MathHelper.static_int);
        MathHelper.static_int = 8;
        MathHelper mathObject = new MathHelper();
        System.out.println("Second test: Before changes simple_int: " + mathObject.simple_int);
        mathObject.simple_int = 8;
    }
}
