import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }

    // Método para calcular o fatorial de um número
    public static int calcularFatorial(int num) {
        if (num == 0 || num == 1) {
            return 1; // O fatorial de 0 e 1 é 1
        } else {
            int resultado = 1;
            for (int i = 2; i <= num; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
