import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bruno
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por virgula (ex: Bruno,Brenda,Ana,Gustavo): ");

        String resposta = scanner.next();
        String[] alunos = resposta.split(",");
        Arrays.sort(alunos);

        System.out.println("Aqui está a lista de nomes em ordem alfabética");
        System.out.println(Arrays.toString(alunos));
        scanner.close();
    }
}