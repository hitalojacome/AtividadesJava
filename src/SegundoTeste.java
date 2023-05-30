import java.util.Scanner;

public class SegundoTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        String formacao;
        String cargo;

        System.out.println("Meu segundo pgm em Java!");

        System.out.println("Informe seu nome");
        nome = scanner.nextLine();

        System.out.println("Insira sua idade");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual sua formação?");
        formacao = scanner.nextLine();

        System.out.println("E qual seu papel no demoday?");
        cargo = scanner.nextLine();

        System.out.println("Ola " + nome + ", você tem " + idade + " anos");
        System.out.println("É formado em " + formacao + " e cumpre o papel de " + cargo + " em seu demoday." );
    }
}
