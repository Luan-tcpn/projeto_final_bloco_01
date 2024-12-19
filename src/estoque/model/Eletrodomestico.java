package estoque.model;

public class Eletrodomestico extends Produto{
	private int potencia;
	
	public Eletrodomestico(int codigoProd, String nomeProd, String descProd, int tipo, float precoProd, int quantidadeEstoque, int potencia) {
		super(codigoProd, nomeProd, descProd, tipo, precoProd, quantidadeEstoque);
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
		System.out.println("Potencia: " + this.potencia +"W");
	}
}
