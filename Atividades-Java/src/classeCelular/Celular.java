package classeCelular;

import java.util.Scanner;

public class Celular {
	
	Scanner scanner = new Scanner(System.in);
	
	private String dono, marca, modelo, cor;
	private int armazenamento, volumeAtual, volume;
	private boolean ligado;
	
	//Determinando os métodos do celular;
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
	
	//Informações referente ao celular;
	public void infoCelular() {
		System.out.println("Olá sr.(a) " + this.dono + " irei te passar todas as informações do seu aparelho.");
		System.out.println("Seu smartphone é da marca: " + this.marca);
		System.out.println("O modelo é: " + this.modelo);
		System.out.println("A cor do aparelho é: " + this.cor);
		System.out.println("Tem: " + this.armazenamento + "GB de armazenamento.");
		
		if (this.volumeAtual == this.volume) {
			System.out.println("Seu volume está no máximo.");
		} else if (this.volumeAtual == 0) {
			System.out.println("Seu volume está desligado.");
		} else {
			System.out.println("Seu volume está em " + this.volumeAtual + "%");
		}
		
		if (this.ligado == true) {
			System.out.println("O aparelho está ligado.\n");
		} else {
			System.out.println("O aparelho está desligado.\n");
		}
	}
	
	//Função para ligar o Celular;
	public void ligarCelular() {
		if (this.ligado == true) {
			System.out.println("Seu celular já está ligado");
		} else {
			this.ligado = true;
			System.out.println("Celular iniciado.");
		}
	}
	
	//Função para desligar o Celular;
	public void desligarCelular() {
		if (this.ligado == false) {
			System.out.println("Seu celular já está desligado");
		} else {
			this.ligado = false;
			System.out.println("Celular finalizado.");
		}
	}
	
	//Função para aumentar o volume do Celular;
	public void aumentarVolume(int volumeMais) {
		if (this.volumeAtual + volumeMais > this.volume) {
			System.out.println("A capacidade máxima do seu volume é de 100%.\n");
		} else if (this.volumeAtual + volumeMais == this.volume) {
			this.volumeAtual += volumeMais;
			System.out.println("Seu volume está em 100%!\n");
		} else {
			this.volumeAtual += volumeMais;
			System.out.println("Agora seu volume está em " + this.volumeAtual + "%.\n");
		}
	}
	
	//Função para diminuir o volume do Celular;
	public void abaixarVolume(int volumeMenos) {
		if (this.volumeAtual - volumeMenos < 0) {
			System.out.println("A capacidade mínima do seu volume é 0%.\n");
		} else if (this.volumeAtual - volumeMenos == 0) {
			this.volumeAtual -= volumeMenos;
			System.out.println("Seu volume está desligado.");
		} else {
			this.volumeAtual -= volumeMenos;
			System.out.println("Agora seu volume está em " + this.volumeAtual +"%.\n");
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
		System.out.println("1 - Exibir informações do meu celular");
		System.out.println("2 - Ligar celular.");
		System.out.println("3 - Desligar celular.");
		System.out.println("4 - Aumentar volume.");
		System.out.println("5 - Abaixar volume.");
		System.out.println("6 - Finalizar operações");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}
	
	//Função que determina o que ocorre quando o usuário insere um valor no teclado correspondente ao Menu;
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
				System.out.println("Não é possível aumentar seu volume com o aparelho desligado.\n");
			}else if (this.volumeAtual == this.volume) {
				System.out.println("O volume do seu celular já está no máximo.\n");
			} else {
				System.out.println("Quantos % deseja aumentar o volume?");
				volumeMais = scanner.nextInt();
				
				aumentarVolume(volumeMais);
			}
			
			break;
		
		case 5:
			if (this.ligado == false) {
				System.out.println("Não é possível abaixar seu volume com o aparelho desligado.\n");
			} else if (this.volumeAtual == 0) {
				System.out.println("O volume do seu celular está desligado.\n");
			} else {
				System.out.println("Quantos % de volume você deseja abaixar?");
				volumeMenos = scanner.nextInt();
				
				abaixarVolume(volumeMenos);
			}
			
			break;
		
		case 6:
			System.out.println("Muito obrigado e volte sempre :D");
			break;
			
		default:
			System.out.println("Operação inválida, favor inserir um valor de 1 a 6.");
		}
		
	}
}