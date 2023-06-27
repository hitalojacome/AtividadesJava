package controller;

import model.FestaAniversarioModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FestaAniversarioController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Informe o nome do(a) aniversariante: ");
        String nomeAniversariante = scanner.nextLine();

        System.out.println("Informe o tema da festa: ");
        String tema = scanner.nextLine();

        System.out.println("Informe a idade que o(a) aniversariante está fazendo: ");
        int idade = scanner.nextInt();

        System.out.println("Informe a quantidade de convidados da festa: ");
        int convidados = scanner.nextInt();

        System.out.println("Informe a data da festa no formato dd/MM/yyyy: ");
        String dataStr = scanner.next();

        Date data = null;
        try {
            data = dateFormat.parse(dataStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido!");
        }

        scanner.close();

        FestaAniversarioModel festa = new FestaAniversarioModel(nomeAniversariante, tema, idade, convidados, data);

        System.out.println("----------Info Festa----------");
        System.out.println("Nome da aniversariante: " + festa.getNomeAniversariante());
        System.out.println("Tema da festa: " + festa.getTema());
        System.out.println("Idade da aniversariante: " + festa.getIdade());
        System.out.println("Quantidade de convidados: " + festa.getConvidados());
        System.out.println("Data da festa: " + festa.getData());
    }
}