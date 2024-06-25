import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author bruno
 */

public class Parte2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt para entrada dos nomes
            System.out.println("Digite os nomes dos alunos no formato 'Nome - Genero' separados por vírgula (ex: Bruno - M, Brenda - F): ");

            // Leitura da linha completa de entrada
            String resposta = scanner.nextLine();

            // Divisão da entrada em várias partes usando a vírgula como delimitador
            String[] nomes = resposta.split(", ");

            // Listas para armazenar alunos e alunas separadamente
            List<String> alunos = new ArrayList<>();
            List<String> alunas = new ArrayList<>();

            // Loop através da matriz nomes para separar de acordo com o gênero
            for (String nomeGenero : nomes) {
                String[] partes = nomeGenero.split(" - ");
                if (partes.length == 2) {
                    String nome = partes[0];
                    String genero = partes[1];

                    if (genero.equalsIgnoreCase("M")) {
                        alunos.add(nome);
                    } else if (genero.equalsIgnoreCase("F")) {
                        alunas.add(nome);
                    } else {
                        System.out.println("Gênero inválido para " + nome);
                    }
                } else {
                    System.out.println("Formato inválido para " + nomeGenero);
                }
            }

            // Exibe as listas separadas
            System.out.println("Alunos:");
            for (String nome : alunos) {
                System.out.println(nome);
            }

            System.out.println("Alunas:");
            for (String nome : alunas) {
                System.out.println(nome);
            }

            scanner.close();
        }
    }

