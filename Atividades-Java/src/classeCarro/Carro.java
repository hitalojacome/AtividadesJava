package classeCarro;

import java.util.Scanner;

public class Carro {
	
	Scanner scanner = new Scanner(System.in);

	private String marca, modelo, cor;
	private int ano, velocidade;
	private double kmRodados;
	private boolean ligado;
	
	//Determinando os métodos do carro;
	public Carro(String marca, String modelo, String cor, int ano, double kmRodados, boolean ligado) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.kmRodados = kmRodados;
		this.ligado = ligado;
		this.velocidade = 0;
	}
	
	//Informações referente ao celular;
	public void info() {
		System.out.println("Bem vindo a consulta de Veículos.");
		System.out.println("Essas são as informações do seu veículo:\n");
		System.out.println("A marca do seu carro é: " + this.marca);
		System.out.println("O modelo do seu carro é: " + this.modelo);
		System.out.println("A cor do seu veículo é: " + this.cor);
		System.out.println("Seu veículo é do ano de: " + this.ano);
		System.out.println("Seu veículo tem " + this.kmRodados + "km rodados.");
		
		if (this.ligado == true) {
			System.out.println("  Seu carro está LIGADO!");
		} else {
			System.out.println("  Seu carro está DESLIGADO!");
		}
		
		if (this.velocidade == 0) {
			System.out.println("  Seu carro está PARADO.\n");
		} else {
			System.out.println("  Seu carro está a " + this.velocidade + "km/h.");
		}
	}
	
	//Função para ligar o carro;
	public void ligar() {
		if (this.ligado == true) {
			System.out.println("Seu carro JÁ estava LIGADO.\n");
		} else {
			this.ligado = true;
			System.out.println("Agora seu carro ESTÁ LIGADO!\n");
		}
	}
	
	//Função para desligar o carro;
	public void desligar() {
		if (this.ligado == false) {
			System.out.println("Seu carro JÁ estava DESligado.\n");
		} else {
			this.ligado = false;
			System.out.println("Agora seu carro ESTÁ DESligado.\n");
		}
	}
	
	//Função para acelerar o carro;
	public void acelerar(int incremento) {
		if (this.velocidade + incremento > 250) {
			System.out.println("A velocidade máxima do seu carro é de 250km/h.\n");
		} else if (this.velocidade + incremento == 250){
			this.velocidade += incremento;
			System.out.println("Seu carro está em velocidade máxima!.\n");
		} else {
			this.velocidade += incremento;
			System.out.println("O carro acelerou para " + this.velocidade + "km/h.\n");
		}
	}
	
	//Função para freiar o carro;
	public void freiar(int decremento) {
		if (this.velocidade - decremento <= 0) {
			this.velocidade -= decremento;
			System.out.println("Seu carro parou!\n");
		} else {
			this.velocidade -= decremento;
			System.out.println("O carro freiou para " + this.velocidade + "km/h.\n");
		}
	}
	
	//Inicialização da aplicação;
	public void Iniciar() {
		int funcao;
		do {
			ExibirMenu();
			funcao = scanner.nextInt();
			
			escolherFuncao(funcao);
		} while (funcao != 6);
	}
	
	//Função para exibição do Menu de interações;
	public void ExibirMenu() {
		System.out.println("Digite a ação que desejar: \n");
		System.out.println("1 - Exibir informações do meu carro.");
		System.out.println("2 - Ligar carro.");
		System.out.println("3 - Desligar carro.");
		System.out.println("4 - Acelerar.");
		System.out.println("5 - Freiar.");
		System.out.println("6 - Finalizar operações");
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
				System.out.println("Não é possível acelerar com o carro desligado.\n");
			} else {
				System.out.println("Informe o incremento de velocidade.\n");
				incremento = scanner.nextInt();
				
				acelerar(incremento);
			}
			
			break;
			
		case 5:
			if (this.ligado == false) {
				System.out.println("Não é possível freiar com o carro desligado.\n");
			} else {
				System.out.println("Informe o decremento de velocidade.\n");
				decremento = scanner.nextInt();
				
				freiar(decremento);
			}

			break;
			
		case 6:
			System.out.println("Até logo!");
			break;
			
		default:
			System.out.println("Opção inválida");
		}
	}
}
