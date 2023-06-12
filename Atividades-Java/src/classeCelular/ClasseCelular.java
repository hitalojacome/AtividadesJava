package classeCelular;

import java.util.Scanner;

public class ClasseCelular {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		System.out.println("Informe seu nome: ");
		String dono = scanner.nextLine();
		
		Celular celular1 = new Celular(dono, "Samsung", "A10", "Rosa", 64, 80, true);
		
		celular1.Iniciar();
		
		scanner.close();
	}

}