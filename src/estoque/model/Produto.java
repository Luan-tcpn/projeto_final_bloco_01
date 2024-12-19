package estoque.model;

public abstract class Produto {

	private int codigoProd;
	private String nomeProd;
	private String descProd;
	private int tipo;
	private float precoProd;
	private int quantidadeEstoque;

	public Produto(int codigoProd, String nomeProd, String descProd, int tipo, float precoProd, int quantidadeEstoque) {
		this.codigoProd = codigoProd;
		this.nomeProd = nomeProd;
		this.descProd = descProd;
		this.tipo = tipo;
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

	public int getCodigoProd() {
		return codigoProd;
	}

	public void setCodigoProd(int codigoProd) {
		this.codigoProd = codigoProd;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Eletronico";
			break;
		case 2:
			tipo = "Eletrodoméstico";
			break;

		}
		System.out.println("Codigo do produto: " + this.codigoProd);
		System.out.println("Nome Produto: " + this.nomeProd);
		System.out.println("Descrição: " + this.descProd);
		System.out.println("Tipo: " + tipo);
		System.out.println("Preço: " + this.precoProd);
		System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);

	}
}
