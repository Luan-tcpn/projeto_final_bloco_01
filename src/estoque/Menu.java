package estoque;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		int opcao;
		Scanner leia = new Scanner(System.in);

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
			opcao = 0 ;
		}
		
		if (opcao == 5) {
			System.out.println("\nObrigado por confiar nos serviços EletroGen");
			System.exit(0);
		}
		
		switch (opcao) {
		case 1:
			System.out.println("Adicionar Produto");
			keyPress();
			break;
	
		case 2: 
			System.out.println("Lista de Produtos");
			keyPress();
			break;
			
		case 3: 
			System.out.println("Atualizar Produto");
			keyPress();
			break;
			
			
		case 4: 
			System.out.println("Excluir Produto");
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
	}catch(IOException e){
		System.out.println("Você pressionou uma tecla diferente de enter! ");
	}
}
}
