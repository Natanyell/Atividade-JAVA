import java.util.Scanner; // Esta linha importa a classe Scanner do pacote java.util, que é usada para receber entrada do usuário a partir do teclado.

public class q1 { // eclaração da classe chamada q1.
    public static void main(String [] args){ //Declaração do método principal main, que é o ponto de entrada do programa Java.
        Scanner entrada = new Scanner(System.in); // Criação de um objeto Scanner chamado entrada, que será usado para ler entrada do usuário.
        int antecessor=0, sucessor=0; // Declaração e inicialização das variáveis numero, antecessor e sucessor.

        System.out.println("Informe um número: "); // Exibe uma mensagem solicitando que o usuário informe um número.
        int numero = entrada.nextInt(); //Lê um número inteiro digitado pelo usuário e armazena na variável numero.
        sucessor = numero  + 1; //Calcula o sucessor do número digitado pelo usuário.
        antecessor = numero - 1; //Calcula o antecessor do número digitado pelo usuário.

        System.out.println("O número informado foi " + numero); //Exibe na tela o número informado pelo usuário.
        System.out.println("O antecessor é " + antecessor); //Exibe na tela o antecessor do número informado pelo usuário.
        System.out.println("O sucessor é " + sucessor); //Exibe na tela o sucessor do número informado pelo usuário.
    }
}
