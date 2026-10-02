import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");

        String edad = sc.nextLine();
        System.out.println("Tu edad es: " + edad);

        sc.close();
    }
}