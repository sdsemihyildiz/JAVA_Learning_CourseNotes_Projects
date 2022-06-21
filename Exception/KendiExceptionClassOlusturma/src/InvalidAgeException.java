public class InvalidAgeException extends ArithmeticException {
    public InvalidAgeException(String mesaj) {
        super(mesaj);

    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasidir...");



    }
}
