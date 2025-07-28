package Frutaria.view;
import java.util.*;

public class Atendente {
	
	Scanner input = new Scanner(System.in);

	public int TelaInicial() {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃               FrutApp                  ┃");
		System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
		System.out.println("┃ 1 - Cadastrar Produto                  ┃");
		System.out.println("┃ 2 - Listar Produto                     ┃");
		System.out.println("┃ 3 - Remover Produto                    ┃");
		System.out.println("┃ 4 - Sair FrutApp                       ┃");
		System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
		int option = input.nextInt();
		
		return option;
	}
	
	public int OpcaoCadastro() {
		

		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃         O que deseja cadastrar?        ┃");
		System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
		System.out.println("┃ 1 - Fruta                              ┃");
		System.out.println("┃ 2 - Verdura                            ┃");
		System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
		int option = input.nextInt();
		input.nextLine();
		return option;

	}
	
//metodos fruta===========================================================================================================
	
	public String CadastrarNomeFruta() {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃         Digite o nome da Fruta         ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
		String nome = input.nextLine();
		
		return nome;
	}
	
	public double CadastrarPrecoFruta() {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃        Digite o preço da Fruta         ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n: R$");
		double preco = input.nextDouble();
		
		return preco;
	}
	
	public int CadastrarQuantidadeFruta() {
		

		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃      Digite a Quantidade de Frutas     ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n: R$");
		int quant = input.nextInt();
		
		return quant;
	}
	
	public double CadastrarPesoFruta() {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃        Digite o peso da Fruta          ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n: ");
		double peso = input.nextDouble();
		
		return peso;
	}

//metodos verdura===========================================================================================================
	
	public String CadastrarNomeVerdura() {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃		Digite o nome da verdura		 ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
		String nome = input.nextLine();
		
		return nome;
	}
	
	public double CadastrarPrecoVerdura() {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃		Digite o preço da Verdura	     ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n: R$");
		double preco = input.nextDouble();
		
		return preco;
	}
	
	public int CadastrarQuantidadeVerdura() {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃	 Digite a Quantidade de verdura 	 ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n: R$");
		int quant = input.nextInt();
		
		return quant;
	}
	
	public String CadastrarTipoVerdura() {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃	    Digite o Tipo de verdura      	 ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n: R$");
		String tipo = input.nextLine();
		
		return tipo;
	}
	
	
	
}
