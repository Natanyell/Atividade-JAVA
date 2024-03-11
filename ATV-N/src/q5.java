import java.util.ArrayList;
import java.util.Collections;

public class q5 {
    public static void main(String[] args) {
        ArrayList<String> tabela = new ArrayList<>();

        // Preenchendo a lista com os 20 primeiros colocados
        tabela.add("Flamengo");
        tabela.add("Palmeiras");
        tabela.add("Atlético Mineiro");
        tabela.add("Fortaleza");
        tabela.add("Athletico Paranaense");
        tabela.add("São Paulo");
        tabela.add("Internacional");
        tabela.add("Ceará");
        tabela.add("Atlético Goianiense");
        tabela.add("Bahia");
        tabela.add("Fluminense");
        tabela.add("Corinthians");
        tabela.add("Juventude");
        tabela.add("Sport Recife");
        tabela.add("Santos");
        tabela.add("Cuiabá");
        tabela.add("América Mineiro");
        tabela.add("Grêmio");
        tabela.add("Chapecoense");
        tabela.add("Bragantino");

        // (a) Os 5 primeiros times
        System.out.println("Os 5 primeiros times:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + tabela.get(i));
        }

        // (b) Os últimos 4 colocados
        System.out.println("\nOs últimos 4 colocados:");
        for (int i = tabela.size() - 4; i < tabela.size(); i++) {
            System.out.println((i + 1) + ". " + tabela.get(i));
        }

        // (c) Times em ordem alfabética
        Collections.sort(tabela);
        System.out.println("\nTimes em ordem alfabética:");
        for (int i = 0; i < tabela.size(); i++) {
            System.out.println((i + 1) + ". " + tabela.get(i));
        }

        // (d) Posição da Chapecoense
        int posicaoChapecoense = tabela.indexOf("Chapecoense") + 1;
        System.out.println("\nPosição da Chapecoense: " + posicaoChapecoense);
    }
}
