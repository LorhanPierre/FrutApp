package Frutaria.app;
import Frutaria.service.Estoque;
import Frutaria.view.Atendente;

public class FrutApp {

	public static void main(String[] args) {

		Estoque estoque = new Estoque();
		Atendente atendente = new Atendente();

		while(estoque.GerenciarEstoque(0) != 4);

	}

}
