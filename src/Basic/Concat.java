package Basic;// Biblioteca responsável por fazer o Java ler uma entrada
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        // Declarando uma entrada de dados
        Scanner entry = new Scanner(System.in);
        System.out.print("Digite quantos centimetros deseja converter: ");

        // Convertendo a entrada e logo em seguida atribundo a uma variável
        float metros = entry.nextFloat() / 100;

        // Contatenando com sinal de +
        System.out.println("Resultado = "+ metros + " Metros");

        // Concatenando de forma diferente
        System.out.printf("Resultado = %.2f Metros", metros );
    }
}
