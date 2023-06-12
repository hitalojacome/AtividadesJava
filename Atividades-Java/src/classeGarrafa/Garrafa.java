package classeGarrafa;

import java.util.Scanner;

public class Garrafa {
	
	Scanner scanner = new Scanner(System.in);

	private String cor, modelo, material;
	private int capacidadeMax, capacidadeAtual;
	private boolean tampada;
	
	//Determinando os m�todos da garrafa;
	public Garrafa(String cor, String modelo, String material, int capacidadeMax, int capacidadeAtual, boolean tampada) {
		this.cor = cor;
		this.modelo = modelo;
		this.material = material;
		this.capacidadeMax = capacidadeMax;
		this.capacidadeAtual = capacidadeAtual;
		this.tampada = tampada;
	}
	
	//Informa��es da garrafa;
	public void infoGarrafa() {
		System.out.println("A cor da sua garrafa �: " + this.cor);
		System.out.println("A modelo da sua garrafa �: " + this.modelo);
		System.out.println("O material da sua garrafa �: " + this.material);
		System.out.println("A quantidade m�xima suportada � de: " + this.capacidadeMax + "ml.");
		
		if (this.tampada == true) {
			System.out.println("Sua garrafa est� fechada.");
		} else {
			System.out.println("Sua garrafa est� aberta.");
		}
		
		if (this.capacidadeAtual == this.capacidadeMax) {
			System.out.println("Sua garrafa est� cheia.\n");
		} else if (this.capacidadeAtual == 0) {
			System.out.println("Sua garrafa est� vazia.\n");
		} else {
			System.out.println("Sua garrafa est� ocupando somente " + this.capacidadeAtual + "ml.\n");
		}
	}
	
	//Fun��o para abrir a garrafa;
	public void abrirGarrafa() {
		if (this.tampada == true) {
			this.tampada = false;
			System.out.println("Agora a sua garrafa est� aberta.\n");
		} else {
			System.out.println("Sua garrafa j� estava aberta.\n");
		}
	}
	
	//Fun��o para fechar a garrafa;
	public void fecharGarrafa() {
		if (this.tampada == false) {
			this.tampada = true;
			System.out.println("Agora sua garrafa est� fechada.\n");
		} else {
			System.out.println("Sua garrafa j� estava fechada.\n");
		}
	}
	
	//Fun��o para encher a garrafa;
	public void encherGarrafa(int valor) {
		if (this.capacidadeAtual + valor > this.capacidadeMax) {
			System.out.println("N�o � poss�vel adicionar este valor pois excede o valor total da garrafa.");
			System.out.println("Sua garrafa suporta: " + this.capacidadeMax + "ml e atualmente tem " + this.capacidadeAtual + "ml.\n");
		} else if (this.capacidadeAtual + valor == this.capacidadeMax ){
			this.capacidadeAtual += valor;
			System.out.println("Sua garrafa est� cheia!\n");
		} else {
			this.capacidadeAtual += valor;
			System.out.println("Agora sua garrafa est� com " + this.capacidadeAtual + "ml.\n");
		}
	}
	
	//Fun��o para beber da garrafa;
	public void beber(int volume) {
		if  (volume > this.capacidadeMax) {
			System.out.println("Insira um valor compativel com a capacidade m�xima da garrafa.\n");
			System.out.println("Capacidade m�xima: " + this.capacidadeMax + "ml.\n");
		} else if (volume > this.capacidadeAtual) {
			System.out.println("Voc� s� pode beber a quantidade que est� na garrafa.");
			System.out.println("A quantidade atual na garrafa � de " + this.capacidadeAtual + "ml.\n");
		} else if (volume == this.capacidadeAtual) {
			this.capacidadeAtual -= volume;
			System.out.println("Voc� bebeu todo o conte�do da garrafa.\n");
		} else {
			this.capacidadeAtual -= volume;
			System.out.println("Voc� bebeu " + volume + "ml, agora sua garrafa est� com " + this.capacidadeAtual + "ml.\n");
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
		System.out.println("1 - Exibir minha Garrafa");
		System.out.println("2 - Abrir a garrafa");
		System.out.println("3 - Fechar a garrafa");
		System.out.println("4 - Encher a garrafa");
		System.out.println("5 - Beber da garrafa");
		System.out.println("6 - Finalizar opera��es");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}
	
	//Fun��o que determina o que ocorre quando o usu�rio insere um valor no teclado correspondente ao Menu;
	public void escolherFuncao(int funcao) {
		int valor;
		int volume;
		
		switch (funcao) {
		
		case 1:
			infoGarrafa();
			break;
			
		case 2:
			abrirGarrafa();
			break;
			
		case 3:
			fecharGarrafa();
			break;
		
		case 4:
			if (this.tampada == true) {
				System.out.println("N�o � poss�vel encher a garrafa pois ela se encontra fechada.\n");
			} else if (this.capacidadeAtual == this.capacidadeMax) {
				System.out.println("Sua garrafa est� cheia.\n");
			} else if (this.capacidadeAtual < this.capacidadeMax) {
				System.out.println("Quantos ml vai adicionar a garrafa? ");
				valor = scanner.nextInt();
				
				encherGarrafa(valor);
			}
			break;
			
		case 5:
			if (this.tampada == true) {
				System.out.println("N�o � poss�vel beber pois sua garrafa se encontra fechada.\n");
			} else if (this.capacidadeAtual == 0) {
				System.out.println("N�o � poss�vel beber da garrafa pois ela se encontra vazia.\n");
			} else if (this.capacidadeAtual > 0) {
				System.out.println("Quantos ml vai beber da garrafa? ");
				volume = scanner.nextInt();
				
				beber(volume);
			}
			break;
		
		case 6:
			System.out.println("Volte sempre :D");
			break;
			
		default:
			System.out.println("Opera��o inv�lida");
		}
	}
}