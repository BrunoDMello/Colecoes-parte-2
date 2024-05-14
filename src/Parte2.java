import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author bruno
 */

public class Parte2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList alunos = new ArrayList<>();
        ArrayList alunas = new ArrayList<>();

        System.out.println("Digite os nomes dos alunos seguidos de M para masculino ou F para feminino (ex: 'João M', 'Ana F'), e digite 'fim' para encerrar.");
        while(scanner.hasNextLine()) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            String[] partes = entrada.split(" ");
            if (partes.length >= 2) {
                String nome = partes[0];
                String genero = partes[1];
                if (genero.equalsIgnoreCase("M")) {
                    alunos.add(nome);
                } else if (genero.equalsIgnoreCase("F")) {
                    alunas.add(nome);
                }
            }
        }
        scanner.close();

        System.out.println("Alunos:");
        for (String nome : alunos) {
            System.out.println(nome);
        }
        System.out.println("Alunas:");
        for (String nome : alunas) {
            System.out.println(nome);
        }
    }
}