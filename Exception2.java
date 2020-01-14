package exception;

public class Exception2 {

    public static void method(int a) {
        try {
            if (a>10)
                throw new MyException();
            System.out.println("No exception");
        } catch (MyException ex) {

        }
        finally {
            System.out.println("a = "+a);
        }

    }

    public static void main(String[] args) {
        method(15);
        Child.method(5,6);

    }
}
