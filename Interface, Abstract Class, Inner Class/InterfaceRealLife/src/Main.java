public class Main {
    public static void main(String[] args) {

        SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
        signUpManager.signUp(new User(1, "Semih", 18));


    }
}
