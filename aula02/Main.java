import java.util.Scanner;

class Main {

    public static void main(String[] args) {
		var scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        String input = scanner.nextLine();
        System.out.println("Você digitou: " + input);
    }

}