package Frutaria.model;

public class Produto {
	
	protected String nome;
	protected double preco;
	protected int quantidade;
	
	public Produto () {
		
		String nome = "";
		double preco = 0.0;
		int quantidade = 0;
		
	}
	
	public Produto (String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
	}
	

}
