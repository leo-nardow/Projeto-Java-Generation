package ProjetoJavaGeneration;

import java.util.Scanner;
/*Classe responsavel por:
 * - Main do programa
 * - Apresentar o menu com as funcionalidades do projeto
 * - Criar os objetos necessarios para funcionalidade do programa
 * */ 
public class MainCaixa {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		Caixa venda = new Caixa(args, null, false);
		Funcionario func = new Funcionario(null, null, 0);
		int op=0; //Operador do menu
		
		System.out.println("Por favor, infome o seu id:");
		func.setId(ler.nextInt());
		
		//Checar o id do Funcionario que irá realizar a venda
		if (!func.isIdValido(func.getId())) {
			while (!func.isIdValido(func.getId())) {
				System.out.println("Id Inválido!");
				System.out.println("Por favor, infome o seu id corretamente:");
				func.setId(ler.nextInt());
			}
		}
		
		System.out.println("Bem-vindo "+func.getNome(func.getId())+"\n");
		
		//Menu
		while(op != 99) {
			System.out.println("Digite uma das opções a seguir:");
			System.out.println("1 - Iniciar uma nova venda:");
			System.out.println("2 - Exibir lista de produtos:");
			System.out.println("99 - Fechar o programa:");
			op = ler.nextInt();
			
			switch (op) {
				case 1:
					venda.setAbrirCaixa(true);
					if (venda.iniciarVenda() == 1) {// Se houve compra entãoo o funcionario irá ganhar uma comissão
						func.comissao();
					}
				break;
				case 2:
					venda.produto.exibirProdutos();
				break;
				case 99:
					venda.setAbrirCaixa(false);
				break;
				default:
					System.out.println("Comando Inválido!");
				break;
			}
			System.out.println();
		}
		System.out.println("A quantidade de vendas feitas pelo funcionário "+func.getNome(func.getId())+" foram de: "+func.getCompras());
	}
}
