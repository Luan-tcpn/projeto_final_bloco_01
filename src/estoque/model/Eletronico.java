package estoque.model;

public class Eletronico extends Produto{
	private int memoria;
	
	public Eletronico(String nomeProd, String descProd, float precoProd, int quantidadeEstoque, int memoria) {
		super(nomeProd, descProd, precoProd, quantidadeEstoque);
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
