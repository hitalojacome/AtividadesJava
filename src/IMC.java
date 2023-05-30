import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("---Calculo de IMC---");

        System.out.println("Informe o seu peso em quilogramas: ");
        peso = scanner.nextDouble();

        System.out.println("Informe a sua altura em metros: ");
        altura = scanner.nextDouble();

        imc = peso / Math.pow (altura, 2);

        System.out.printf("Seu IMC e de: %.2f\n", imc);

        if (imc >= 40) {
            System.out.println("E esta classificado como Obesidade Morbida");
        } else if (imc > 35) {
            System.out.println("E esta classificado como Obesidade Grau II");
        } else if (imc > 30) {
            System.out.println("E esta classificado como Obesidade Grau I");
        } else if (imc > 25) {
            System.out.println("E esta classificado como Sobrepeso");
        } else if (imc > 18.5) {
            System.out.println("E esta classificado como peso normal");
        } else {
            System.out.println("E esta classificado como abaixo do peso");
        }

    }

}
