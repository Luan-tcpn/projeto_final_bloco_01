package estoque.controller;

import java.util.ArrayList;

import estoque.model.Produto;
import estoque.repository.EstoqueRepository;

public class EstoqueController implements EstoqueRepository{

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	
	@Override
	public void listarTodos() {
		for (var estoque : listaProdutos) {
			estoque.visualizar();
		}
	}
	@Override
	public void cadastrar(Produto estoque) {
		listaProdutos.add(estoque);
		System.out.println("Produto: " + estoque.getNomeProd() + " foi adicionado com exito!");
	}
	
	
	@Override
	public void atualizar(Produto estoque) {
		var buscaProd = buscarNaCollection(estoque.getCodigoProd());
		
		if(buscaProd != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProd), estoque);
			System.out.println("Produto numero: " + estoque.getCodigoProd() + " foi atualizado com sucesso!");
		}else {
			System.out.println("Produto numero: " + estoque.getCodigoProd() + " não foi encontrado!");
		}
	}
	
	@Override
	public void deletar(int codigoProd) {
		var estoque = buscarNaCollection(numero);
		
		if (estoque != null) {
			if(listaProdutos.remove(estoque) == true)
				System.out.println("\nO produto com codigo : " + numero + " foi deletado com sucesso!");
		}else
			System.out.println("\nO produto com codigo : " + numero + " não foi encontrada!");
	}
	
	public Produto buscarNaCollection(int numero) {
		for (var estoque : listaProdutos) {
			if (estoque.getCodigoProd() == numero) {
				return estoque;
			}
		}
		
		return null;
	}
	
	public int gerarNumero() {
		
		return ++ numero;
		
}
	
}
