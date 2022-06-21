import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Bir cümlenin palindrome olup olmadığını bulma
        //Kasaylabalyasak
        System.out.print("Cumle yaziniz(butun harfleri kucuk olacak ve ya buyuk olacak sekilde): ");
        Scanner scanner = new Scanner(System.in);

        String cumle = scanner.nextLine();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < cumle.length() / 2; i++) {
            stack.push(cumle.charAt(i));


        }
        if (isPalindrome(cumle,stack)){
            System.out.println("Bu cumle palindrome cumledir.");
        }else {
            System.out.println("Bu cumle palindrome degildir.");
        }


    }

    public static boolean isPalindrome(String cumle, Stack<Character> stack) {
        for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {
            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }

        }
        return true;

    }
}
