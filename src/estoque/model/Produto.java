package estoque.model;

public abstract class Produto {
	
	private String nomeProd;
	private String descProd;
	private float precoProd;
	private int quantidadeEstoque;
	
	public Produto(String nomeProd, String descProd, float precoProd, int quantidadeEstoque) {
		this.nomeProd = nomeProd;
		this.descProd = descProd;
		this.precoProd = precoProd;
		this.quantidadeEstoque = quantidadeEstoque;
	
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getDescProd() {
		return descProd;
	}

	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}

	public float getPrecoProd() {
		return precoProd;
	}

	public void setPrecoProd(float precoProd) {
		this.precoProd = precoProd;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void visualizar() {
		System.out.println("Nome Produto: " + this.nomeProd);
		System.out.println("Descrição: " + this.descProd);
		System.out.println("Preço: " + this.precoProd);
		System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);
		
	}
}
