package exception;

public class Example {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
}
