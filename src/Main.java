import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bruno
 */

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por ,  ");

        String resposta = s.next();
        String[] alunos = resposta.split(",");
        Arrays.sort(alunos);

        System.out.println("Aqui está a lista de nomes em ordem alfabética");
        System.out.println(Arrays.toString(alunos));
    }
}