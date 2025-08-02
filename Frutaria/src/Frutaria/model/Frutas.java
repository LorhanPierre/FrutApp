package Frutaria.model;

public class Frutas extends Produto {
	
	protected double peso;
	
	public Frutas(String nome,double preco, int quantidade,double peso) {
		
	super(nome, preco, quantidade);
	this.peso = peso;
		
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}
	
	@Override
	public String toString() {
		return "┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓" +
				"\n  Fruta: " + nome +
				"\n  --------------------------------------" +
				"\n  Preço: R$" + preco +
				"\n  --------------------------------------" +
				"\n  Quantidade: " + quantidade + " unit." +
				"\n  --------------------------------------" +
				"\n  Peso: " + peso + " Kg"+
				"\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n";
	}

}
