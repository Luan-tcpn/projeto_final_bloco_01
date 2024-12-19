package estoque.model;

public class Eletronico extends Produto{
	private int memoria;
	
	public Eletronico(int codigoProd, String nomeProd, String descProd, int tipo, float precoProd, int quantidadeEstoque, int memoria) {
		super(codigoProd, nomeProd, descProd, tipo, precoProd, quantidadeEstoque);
		this.memoria = memoria;
}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Memoria: " + this.memoria + "GB");
}
}
