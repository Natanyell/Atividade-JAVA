import java.util.Scanner; //Esta linha importa a classe Scanner do pacote java.util, que é usada para receber entrada do usuário a partir do teclado.

public class q2 { //Declaração da classe chamada q2.
    public static void main(String[] args) { //Declaração do método principal main, que é o ponto de entrada do programa Java.
        Scanner scanner = new Scanner(System.in); //Criação de um objeto Scanner chamado scanner, que será usado para ler entrada do usuário.

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro para ver a tabuada: "); //Exibe uma mensagem solicitando que o usuário insira um número inteiro.
        int numero = scanner.nextInt(); //ê um número inteiro digitado pelo usuário e armazena na variável numero.

        // Exibe a tabuada do número inserido
        System.out.println("Tabuada de " + numero + ":"); //Exibe uma mensagem indicando que a tabuada do número inserido será mostrada.

        for (int i = 1; i <= 10; i++) { //Inicia um loop for que irá iterar de 1 até 10, inclusivo.
            System.out.println(numero + " x " + i + " = " + (numero * i)); //Exibe a tabuada do número inserido multiplicando-o pelos números de 1 a 10
        }

        scanner.close(); //Fecha o objeto Scanner, liberando os recursos associados a ele.
    }
}
