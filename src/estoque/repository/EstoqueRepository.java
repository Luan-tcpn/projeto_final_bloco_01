package estoque.repository;

import estoque.model.Produto;

public interface EstoqueRepository {
	public void cadastrar (Produto estoque);
	public void atualizar (Produto estoque);
	public void listarTodos();
	public void deletar(int codigoProd);
}
