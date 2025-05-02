import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int secondNumber = scanner.nextInt();

        try {
            contar(firstNumber, secondNumber);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void contar(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            throw new IllegalArgumentException("O primeiro número deve ser menor que o segundo número.");
        }

        int contagem = secondNumber - firstNumber;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
