package Frutaria.service;
import Frutaria.view.Atendente;
import Frutaria.model.*;
import java.util.*;

public class Estoque {
	
	Scanner input = new Scanner(System.in);
	Atendente atendente = new Atendente();
	ArrayList <Produto> ListaProduto = new ArrayList<>();


	public int GerenciarEstoque(int finalizar) {

		switch (atendente.TelaInicial()) {


			case 1 -> {
					switch (atendente.OpcaoTipo()) {

						case 0 -> {}

						case 1 -> {
							String nomeFruta = atendente.definirNomeFruta();
							double precoFruta = atendente.CadastrarPrecoFruta();
							int quantiaFruta = atendente.CadastrarQuantidadeFruta();
							double pesofruta =	atendente.CadastrarPesoFruta();
							Produto produto = new Frutas(nomeFruta,precoFruta,quantiaFruta,pesofruta);
							ListaProduto.add(produto);
						}

						case 2 -> {

							String nomeVerdura = atendente.definirNomeVerdura();
							double precoVerdura = atendente.CadastrarPrecoVerdura();
							int quantiaVerdura = atendente.CadastrarQuantidadeVerdura();
							String tipoVerdura = atendente.CadastrarTipoVerdura();
							Produto produto = new Verdura(nomeVerdura,precoVerdura,quantiaVerdura,tipoVerdura);
							ListaProduto.add(produto);
						}
					}
			}
			case 2 -> {

				switch (atendente.OpcaoTipo()){

					case 0 -> {}

					case 1 -> {
						for(Produto produto : ListaProduto){
							if(produto instanceof Frutas) {
								System.out.println(produto);
							}
						}
					}

					case 2 -> {
						for(Produto produto : ListaProduto){
							if(produto instanceof Verdura){
								System.out.println(produto);
							}
						}
					}

				}

			}

			case 3 -> {
				atendente.painelRemocao();
				boolean removido = false;
				switch (atendente.OpcaoTipo()) {

					case 0 -> {}
					case 1 -> {
						String nomeParaExclusao = atendente.definirNomeFruta();
						for (Produto produto : ListaProduto){
							for(int localProduto = 0; localProduto < ListaProduto.size(); localProduto ++){
								if(produto instanceof Frutas && ListaProduto.get(localProduto).getNome().equalsIgnoreCase(nomeParaExclusao)){
									ListaProduto.remove(localProduto);
									removido = true;
								}
							}
							if(removido = true){
								atendente.RemocaoComSucesso();
							}
							else{
								atendente.RemocaoItemNaoEncontrado();
							}
						}

					}
					case 2 -> {
						String nomeParaExclusao = atendente.definirNomeVerdura();
						for (Produto produto : ListaProduto){
							for(int localProduto = 0; localProduto < ListaProduto.size(); localProduto ++){
								if(produto instanceof Verdura && ListaProduto.get(localProduto).getNome().equalsIgnoreCase(nomeParaExclusao)){
									ListaProduto.remove(localProduto);
									removido = true;
								}
							}
							if(removido = true){
								atendente.RemocaoComSucesso();
							}
							else{
								atendente.RemocaoItemNaoEncontrado();
							}
						}
					}
				}
			}

			case 4 -> {
				finalizar += 4;
				atendente.Encerrando();
			}

		}

		return finalizar;
	}
	
}
