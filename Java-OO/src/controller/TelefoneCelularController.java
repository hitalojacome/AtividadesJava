package controller;

import model.TelefoneCelularModel;

import java.util.Scanner;

public class TelefoneCelularController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a marca do celular: ");
        String marca = scanner.nextLine();

        System.out.println("Informe o modelo do celular: ");
        String modelo = scanner.nextLine();

        System.out.println("Informe o sistema operacional do celular: ");
        String sistemaOperacional = scanner.nextLine();

        System.out.println("Informe o ano do celular: ");
        int ano = scanner.nextInt();

        System.out.println("Informe o armazenamento do celular: ");
        int armazenamento = scanner.nextInt();

        System.out.println("Informe se o celular está ligado: ");
        boolean ligado = scanner.nextBoolean();

        TelefoneCelularModel celular = new TelefoneCelularModel(marca, modelo, sistemaOperacional, ano, armazenamento, ligado);

        System.out.println("----------Info Celular----------");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Sistema Operacional: " + celular.getSistemaOperacional());
        System.out.println("Ano: " + celular.getAno());
        System.out.println("Armazenamento: " + celular.getArmazenamento() + "GB");
        System.out.println("Ligado: " + celular.isLigado());
    }
}
