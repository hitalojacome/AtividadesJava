package classeCelular;

import java.util.Scanner;

public class Celular {
	
	Scanner scanner = new Scanner(System.in);
	
	private String dono, marca, modelo, cor;
	private int armazenamento, volumeAtual, volume;
	private boolean ligado;
	
	//Determinando os m�todos do celular;
	public Celular(String dono, String marca, String modelo, String cor, int armazenamento, int volumeAtual, boolean ligado) {
		this.volume = 100;
		this.dono = dono;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.armazenamento = armazenamento;
		this.volumeAtual = volumeAtual;
		this.ligado = ligado;
	}
	
	//Informa��es referente ao celular;
	public void infoCelular() {
		System.out.println("Ol� sr.(a) " + this.dono + " irei te passar todas as informa��es do seu aparelho.");
		System.out.println("Seu smartphone � da marca: " + this.marca);
		System.out.println("O modelo �: " + this.modelo);
		System.out.println("A cor do aparelho �: " + this.cor);
		System.out.println("Tem: " + this.armazenamento + "GB de armazenamento.");
		
		if (this.volumeAtual == this.volume) {
			System.out.println("Seu volume est� no m�ximo.");
		} else if (this.volumeAtual == 0) {
			System.out.println("Seu volume est� desligado.");
		} else {
			System.out.println("Seu volume est� em " + this.volumeAtual + "%");
		}
		
		if (this.ligado == true) {
			System.out.println("O aparelho est� ligado.\n");
		} else {
			System.out.println("O aparelho est� desligado.\n");
		}
	}
	
	//Fun��o para ligar o Celular;
	public void ligarCelular() {
		if (this.ligado == true) {
			System.out.println("Seu celular j� est� ligado");
		} else {
			this.ligado = true;
			System.out.println("Celular iniciado.");
		}
	}
	
	//Fun��o para desligar o Celular;
	public void desligarCelular() {
		if (this.ligado == false) {
			System.out.println("Seu celular j� est� desligado");
		} else {
			this.ligado = false;
			System.out.println("Celular finalizado.");
		}
	}
	
	//Fun��o para aumentar o volume do Celular;
	public void aumentarVolume(int volumeMais) {
		if (this.volumeAtual + volumeMais > this.volume) {
			System.out.println("A capacidade m�xima do seu volume � de 100%.\n");
		} else if (this.volumeAtual + volumeMais == this.volume) {
			this.volumeAtual += volumeMais;
			System.out.println("Seu volume est� em 100%!\n");
		} else {
			this.volumeAtual += volumeMais;
			System.out.println("Agora seu volume est� em " + this.volumeAtual + "%.\n");
		}
	}
	
	//Fun��o para diminuir o volume do Celular;
	public void abaixarVolume(int volumeMenos) {
		if (this.volumeAtual - volumeMenos < 0) {
			System.out.println("A capacidade m�nima do seu volume � 0%.\n");
		} else if (this.volumeAtual - volumeMenos == 0) {
			this.volumeAtual -= volumeMenos;
			System.out.println("Seu volume est� desligado.");
		} else {
			this.volumeAtual -= volumeMenos;
			System.out.println("Agora seu volume est� em " + this.volumeAtual +"%.\n");
		}
	}
	
	//Inicializa��o da aplica��o;
	public void Iniciar() {
		int funcao;
		
		do {
			ExibirMenu();
			funcao = scanner.nextInt();
			
			escolherFuncao(funcao);
		} while (funcao != 6);
	}
	
	//Fun��o para exibi��o do Menu de intera��es;
	public void ExibirMenu() {
		System.out.println("Digite a a��o que desejar: \n");
		System.out.println("1 - Exibir informa��es do meu celular");
		System.out.println("2 - Ligar celular.");
		System.out.println("3 - Desligar celular.");
		System.out.println("4 - Aumentar volume.");
		System.out.println("5 - Abaixar volume.");
		System.out.println("6 - Finalizar opera��es");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}
	
	//Fun��o que determina o que ocorre quando o usu�rio insere um valor no teclado correspondente ao Menu;
	public void escolherFuncao(int funcao) {
		int volumeMais;
		int volumeMenos;
		
		switch(funcao) {
		
		case 1:
			infoCelular();
			break;
		
		case 2:
			ligarCelular();
			break;
			
		case 3:
			desligarCelular();
			break;
			
		case 4:
			if (this.ligado == false) {
				System.out.println("N�o � poss�vel aumentar seu volume com o aparelho desligado.\n");
			}else if (this.volumeAtual == this.volume) {
				System.out.println("O volume do seu celular j� est� no m�ximo.\n");
			} else {
				System.out.println("Quantos % deseja aumentar o volume?");
				volumeMais = scanner.nextInt();
				
				aumentarVolume(volumeMais);
			}
			
			break;
		
		case 5:
			if (this.ligado == false) {
				System.out.println("N�o � poss�vel abaixar seu volume com o aparelho desligado.\n");
			} else if (this.volumeAtual == 0) {
				System.out.println("O volume do seu celular est� desligado.\n");
			} else {
				System.out.println("Quantos % de volume voc� deseja abaixar?");
				volumeMenos = scanner.nextInt();
				
				abaixarVolume(volumeMenos);
			}
			
			break;
		
		case 6:
			System.out.println("Muito obrigado e volte sempre :D");
			break;
			
		default:
			System.out.println("Opera��o inv�lida, favor inserir um valor de 1 a 6.");
		}
		
	}
}