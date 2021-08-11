package ProjetoJavaGeneration;

import java.util.Scanner;

public class testeProduto {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		Caixa venda = new Caixa(args, null, false);
		Funcionario func = new Funcionario(args, args);
		int op=0;
		
		System.out.println("Porfavor, infome o seu id:");
		func.setId(ler.nextInt());
		
		if (!func.isIdValido(func.getId())) {
			while (!func.isIdValido(func.getId())) {
				System.out.println("Id Invalido!");
				func.setId(ler.nextInt());
			}
		}
		
		System.out.println("Bem-vindo "+func.getNome(func.getId())+"\n");
		
		while(op != 99) {
			System.out.println("Digite uma das opções a seguir:");
			System.out.println("1 - Iniciar uma nova venda:");
			System.out.println("2 - Exibir lista de produtos:");
			System.out.println("99 - Fechar o programa:");
			op = ler.nextInt();
			
			switch (op) {
				case 1:
					
					venda.setAbrirCaixa(true);
				break;
				case 2:
					venda.produto.exibirProdutos();
				break;
				case 99:
					venda.produto.exibirProdutos();
				break;
				default:
					System.out.println("Comando Invalido!");
				break;
			}
		
		}

	}
}
