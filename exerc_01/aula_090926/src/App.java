import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite seu curso: ");
        String curso = entrada.nextLine();
        entrada.nextLine(); // Limpar o buffer do Scanner

        System.out.print("Digite o período: ");
        int periodo = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do Scanner

        System.out.print("Digite a situação da matrícula (true/false): ");
        boolean sMatricula = entrada.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);
        System.out.println("Situação da Matrícula: " + sMatricula);

    }
}
