import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float n1, n2, n3, n4, media;

        System.out.println("---Calculo de media---");

        System.out.println("Qual foi a primeira nota?");
        n1 = scanner.nextFloat();

        System.out.println("Qual foi a segunda nota?");
        n2 = scanner.nextFloat();

        System.out.println("Qual foi a terceira nota?");
        n3 = scanner.nextFloat();

        System.out.println("Qual foi a quarta nota?");
        n4 = scanner.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("Sua média final é de: %.2f\n", media);

        if (media >= 7){
            System.out.println("Parabéns! Você foi aprovado");
        } else if (media >= 5) {
            System.out.println("Voce está de recuperação.");
        }else {
            System.out.println("Infelizmente você foi reprovado.");
        }

    }
}
