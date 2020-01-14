package exception;


public class Exception1 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        int c;

// 1.1 бработка исключения при помощи: try - catch
        try {
            System.out.println(c=a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка "+e);
        }
// 1.2 бработка исключения при помощи: try - finally
        try {
            System.out.println(c=a / b); //Я сомневаюсь в правильности обработки в данном случае!

        } finally {
            System.out.println("На ноль делить нельзя");
        }
// 1.3 бработка исключения при помощи: try - catch - finally
        try {
            System.out.println(c=a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка "+e);
        } finally {
            System.out.println("На ноль делить нельзя");
        }
    }
}

