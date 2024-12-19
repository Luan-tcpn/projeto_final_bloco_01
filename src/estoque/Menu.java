package estoque;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import estoque.controller.EstoqueController;
import estoque.model.Eletrodomestico;
import estoque.model.Eletronico;

public class Menu {

	public static void main(String[] args) {

		int opcao, memoria, potencia, quantidadeEstoque, codigoProd, tipo;
		String nomeProd, descProd;
		float precoProd;
		Scanner leia = new Scanner(System.in);
		EstoqueController produtos = new EstoqueController();

		while (true) {
			System.out.println("______________________________________________");
			System.out.println("                                              ");
			System.out.println("              ESTOQUE ELETROGEN               ");
			System.out.println("                                              ");
			System.out.println("______________________________________________");
			System.out.println("                                              ");
			System.out.println("            1 - Adicionar produto             ");
			System.out.println("            2 - Listar produtos               ");
			System.out.println("            3 - Atualizar produto             ");
			System.out.println("            4 - Excluir produto               ");
			System.out.println("            5 - Sair                          ");
			System.out.println("                                              ");
			System.out.println("______________________________________________");
			System.out.println("Entre com a opção desejada:                   ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 5) {
				System.out.println("\nObrigado por confiar nos serviços EletroGen");
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Adicionar Produto\n\n");
				leia.nextLine();
				System.out.println("Digite o nome do produto: ");
				nomeProd = leia.nextLine();
				leia.nextLine();
				
				System.out.println("Digite a Descrição : ");
				descProd = leia.nextLine();
				leia.nextLine();
				
				System.out.println("Digite o preço : ");
				precoProd = leia.nextFloat();
				leia.nextLine();
				
				System.out.println("Digite a Quantidade : ");
				quantidadeEstoque = leia.nextInt();
				leia.nextLine();

				do {
					System.out.println("Digite o tipo (1 - Eletronico ou 2 - Eletrodoméstico)");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1:
					System.out.println("Digite a quantidade de memoria do dispositivo: ");
					memoria = leia.nextInt();
					produtos.cadastrar(new Eletronico(produtos.gerarNumero(), nomeProd, descProd, tipo, precoProd,
							quantidadeEstoque, memoria));
					break;

				case 2:
					System.out.println("Digite a Potencia do Produto: ");
					potencia = leia.nextInt();
					produtos.cadastrar(new Eletrodomestico(produtos.gerarNumero(), nomeProd, descProd, tipo, precoProd,
							quantidadeEstoque, potencia));
					break;
				}

				keyPress();
				break;

			case 2:
				System.out.println("Lista de Produtos\n\n");
				produtos.listarTodos();
				keyPress();
				break;

			case 3:
				System.out.println("Atualizar Produto\n\n");
				
				System.out.println("Digite o codigo do produto: ");
				codigoProd = leia.nextInt();

				var buscaProd = produtos.buscarNaCollection(codigoProd);

				if (buscaProd != null) {

					System.out.println("Digite o nome do produto: ");
					nomeProd = leia.nextLine();
					leia.nextLine();
					
					System.out.println("Digite a Descrição : ");
					descProd = leia.nextLine();
					leia.nextLine();
					
					System.out.println("Digite o preço : ");
					precoProd = leia.nextFloat();
					leia.nextLine();
					
					System.out.println("Digite a Quantidade : ");
					quantidadeEstoque = leia.nextInt();
					leia.nextLine();

					tipo = buscaProd.getTipo();

					switch (tipo) {
					case 1:
						System.out.println("Digite a quantidade de memoria do dispositivo: ");
						memoria = leia.nextInt();
						produtos.atualizar(new Eletronico(codigoProd, nomeProd, descProd, tipo, precoProd, quantidadeEstoque, memoria));
						
					case 2:
						System.out.println("Digite a Potencia do Produto: ");
						potencia = leia.nextInt();
						produtos.atualizar(new Eletrodomestico(codigoProd, nomeProd, descProd, tipo, precoProd, quantidadeEstoque, potencia));
						
					default:
						System.out.println("Tipo de produto inválido!");
						
						}
				keyPress();
				break;
			}
			
			case 4:
				System.out.println("Excluir Produto\n\n");
				System.out.println("Digite o codigo do produto: ");
				codigoProd = leia.nextInt();
				
				produtos.deletar(codigoProd);
				
				keyPress();
				break;
			default:
				System.out.println("Opção Inválida");
				keyPress();
				break;

			}
		}
	
	}

	public static void keyPress() {
		try {
			System.out.println("\nPressione Enter para Continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter! ");
		}
	
}
}
