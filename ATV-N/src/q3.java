import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.InputStream;

public class q3 {
    public static void main(String[] args) throws Exception, JavaLayerException {
        // Caminho completo para o arquivo MP3
        java.lang.String nomeDoArquivo = "ncs-weare.mp3"; // Insira o caminho completo do seu arquivo MP3 aqui

        InputStream arquivoStream = new FileInputStream(nomeDoArquivo);
        Player player = new Player(arquivoStream);

        System.out.println("Reproduzindo " + nomeDoArquivo);

        player.play();

        System.out.println("Fim da reprodução");

        player.close();
        arquivoStream.close();
    }
}
