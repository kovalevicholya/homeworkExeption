package exception;

public class Child extends Exception2 {
    public static void method (int a, int b){
        try {
            if (a>b)

            System.out.println("No exception");
            else throw new NewMyException();
        } catch (NewMyException ex) {
        }
        finally {
            System.out.println("a = " + a + " b = " + b);
        }
    }
}
