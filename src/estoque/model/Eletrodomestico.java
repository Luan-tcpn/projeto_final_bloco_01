package estoque.model;

public class Eletrodomestico extends Produto{
	private int potencia;
	
	public Eletrodomestico(String nomeProd, String descProd, float precoProd, int quantidadeEstoque, int potencia) {
		super(nomeProd, descProd, precoProd, quantidadeEstoque);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Potencia: " + this.potencia);
	}
}
