package Frutaria.service;
import Frutaria.view.Atendente;
import Frutaria.model.*;
import java.util.*;

public class Estoque {
	
	Scanner input = new Scanner(System.in);
	Atendente atendente = new Atendente();
	ArrayList <Produto> ListaProduto = new ArrayList<>();
	
	public void GerenciarEstoque() {
		
		
		switch (atendente.TelaInicial()) {
		
		case 1:
			
				switch (atendente.OpcaoCadastro()) {
				
				case 1 -> {
						String nomeFruta = atendente.CadastrarNomeFruta();
						double precoFruta = atendente.CadastrarPrecoFruta();
						int quantiaFruta = atendente.CadastrarQuantidadeFruta();
						double pesofruta =	atendente.CadastrarPesoFruta();
						Produto produto = new Frutas(nomeFruta,precoFruta,quantiaFruta,pesofruta);
						ListaProduto.add(produto);
							}
				
				case 2 -> {
					
						String nomeVerdura = atendente.CadastrarNomeVerdura();
						double precoVerdura = atendente.CadastrarPrecoVerdura();
						int quantiaVerdura = atendente.CadastrarQuantidadeVerdura();
						String tipoVerdura = atendente.CadastrarTipoVerdura();
						Produto produto = new Verdura(nomeVerdura,precoVerdura,quantiaVerdura,tipoVerdura);
							} 
				}
			
			break;
		
		}
	}
	
}
