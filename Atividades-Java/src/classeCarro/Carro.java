package classeCarro;

import java.util.Scanner;

public class Carro {
	
	Scanner scanner = new Scanner(System.in);

	private String marca, modelo, cor;
	private int ano, velocidade;
	private double kmRodados;
	private boolean ligado;
	
	//Determinando os m�todos do carro;
	public Carro(String marca, String modelo, String cor, int ano, double kmRodados, boolean ligado) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.kmRodados = kmRodados;
		this.ligado = ligado;
		this.velocidade = 0;
	}
	
	//Informa��es referente ao celular;
	public void info() {
		System.out.println("Bem vindo a consulta de Ve�culos.");
		System.out.println("Essas s�o as informa��es do seu ve�culo:\n");
		System.out.println("A marca do seu carro �: " + this.marca);
		System.out.println("O modelo do seu carro �: " + this.modelo);
		System.out.println("A cor do seu ve�culo �: " + this.cor);
		System.out.println("Seu ve�culo � do ano de: " + this.ano);
		System.out.println("Seu ve�culo tem " + this.kmRodados + "km rodados.");
		
		if (this.ligado == true) {
			System.out.println("  Seu carro est� LIGADO!");
		} else {
			System.out.println("  Seu carro est� DESLIGADO!");
		}
		
		if (this.velocidade == 0) {
			System.out.println("  Seu carro est� PARADO.\n");
		} else {
			System.out.println("  Seu carro est� a " + this.velocidade + "km/h.");
		}
	}
	
	//Fun��o para ligar o carro;
	public void ligar() {
		if (this.ligado == true) {
			System.out.println("Seu carro J� estava LIGADO.\n");
		} else {
			this.ligado = true;
			System.out.println("Agora seu carro EST� LIGADO!\n");
		}
	}
	
	//Fun��o para desligar o carro;
	public void desligar() {
		if (this.ligado == false) {
			System.out.println("Seu carro J� estava DESligado.\n");
		} else {
			this.ligado = false;
			System.out.println("Agora seu carro EST� DESligado.\n");
		}
	}
	
	//Fun��o para acelerar o carro;
	public void acelerar(int incremento) {
		if (this.velocidade + incremento > 250) {
			System.out.println("A velocidade m�xima do seu carro � de 250km/h.\n");
		} else if (this.velocidade + incremento == 250){
			this.velocidade += incremento;
			System.out.println("Seu carro est� em velocidade m�xima!.\n");
		} else {
			this.velocidade += incremento;
			System.out.println("O carro acelerou para " + this.velocidade + "km/h.\n");
		}
	}
	
	//Fun��o para freiar o carro;
	public void freiar(int decremento) {
		if (this.velocidade - decremento <= 0) {
			this.velocidade -= decremento;
			System.out.println("Seu carro parou!\n");
		} else {
			this.velocidade -= decremento;
			System.out.println("O carro freiou para " + this.velocidade + "km/h.\n");
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
		System.out.println("1 - Exibir informa��es do meu carro.");
		System.out.println("2 - Ligar carro.");
		System.out.println("3 - Desligar carro.");
		System.out.println("4 - Acelerar.");
		System.out.println("5 - Freiar.");
		System.out.println("6 - Finalizar opera��es");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}
	
	public void escolherFuncao(int funcao) {
		int incremento;
		int decremento;
		
		switch(funcao) {
		
		case 1:
			info();
			break;
			
		case 2:
			ligar();
			break;
			
		case 3:
			desligar();
			break;
			
		case 4:
			if (this.ligado == false) {
				System.out.println("N�o � poss�vel acelerar com o carro desligado.\n");
			} else {
				System.out.println("Informe o incremento de velocidade.\n");
				incremento = scanner.nextInt();
				
				acelerar(incremento);
			}
			
			break;
			
		case 5:
			if (this.ligado == false) {
				System.out.println("N�o � poss�vel freiar com o carro desligado.\n");
			} else {
				System.out.println("Informe o decremento de velocidade.\n");
				decremento = scanner.nextInt();
				
				freiar(decremento);
			}

			break;
			
		case 6:
			System.out.println("At� logo!");
			break;
			
		default:
			System.out.println("Op��o inv�lida");
		}
	}
}
