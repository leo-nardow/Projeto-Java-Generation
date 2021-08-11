package ProjetoLoja;

import java.util.Scanner;

public class ProjetoLoja {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		String Produto = null, Metodo =null;
		int QntProduto,CodigoProduto = 1, Menu = 0, ContaCompra=0; //Funcionalidades
		int PaoFrances=0,PaoDeLeite=1,RosquinhaDoce=2,RosquinhaSalgada=3,BroaDeMilho=4,Leite1Lt=5,Cafezinho=6,ChocolateQuente=7;
		int P = 20, Add=0;
		double TotalCompra=0;
		int[] M1 = new int[P]; //C�digo para chamar o produto
		double[] M2 = new double[P]; // Valor guardado do produto
		String[] M3 = {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"}; // nome do produto
		
		
		while(Menu!=99)
		{
		switch(Menu)
		{
		case 1:
		
		for(P=0;P<20;P++) //Lista de produtos
		{
				M1[P]=CodigoProduto++;
				System.out.print("C�digo do produto: "+M1[P]);
				System.out.print("\t\tNome do produto: "+M3[P]);
				System.out.print("\t\tValor do produto: "+M2[P]+"\n");
				
				Menu=0;
		}
		CodigoProduto=1;
		break;
		
		case 2:
		do //Iniciar nova compra
		{	
		System.out.println("Insira o produto selecionado: ");
		CodigoProduto=leia.nextInt(); P = CodigoProduto;
		System.out.println("Insira a quantidade de produtos comprados: ");
		QntProduto=leia.nextInt();
		
		TotalCompra = (M2[P]*QntProduto);
		System.out.println("\nValor total da compra atualizado: "+TotalCompra);
		}
		while(CodigoProduto!=0);
		Menu=3;
		break;
		
		case 3:
		do //Cobrar cliente
		{
			System.out.println("\nValor total da compra � de: R$"+TotalCompra);
			System.out.println("\nInsira o m�todo de pagamento: Dinheiro, D�bito ou cr�dito.");
			Metodo=leia.next();
			
			System.out.println("\nO m�todo de pagamento selecionado foi: "+Metodo);
			System.out.println("\nConclua o pagamento, �nsira o valor de entrada.");
			double Pagamento=leia.nextDouble();
			TotalCompra -= Pagamento;
			
			if(TotalCompra==0)
			{
				System.out.println("Compra conclu�da, volte sempre.");
				ContaCompra++;
				Pagamento=0;
				Menu=0;
			}else if(TotalCompra<0)
			{
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\nRetorne o troco de: R$"+(-TotalCompra));
				System.out.println("\n\tCompra conclu�da, volte sempre.");
				Menu=0; TotalCompra=0;
				System.out.println("\n\n");
			}
			
			
		}while(Menu!=0 && TotalCompra!=0);
		break;
		
		case 4:
		do  //Adicionar novo produto.
		{
			System.out.println("\t(Fun��o adicionar novo produto)\n Caso n�o deseje adicionar um novo produto: digite 0,\n caso queira adicionar, digite 1.");
			 Add=leia.nextInt();
			
			if(Add==1)
			{
				String M4 = "0";
				for(P=0;P<20;P++)
				{	
					System.out.println("C�digo do produto: "+M1+" Produto: "+M3+" Valor do produto: "+M2);
					if (M3[P]=="-")
					{	
						int Novoproduto=0;
						
							if(Novoproduto==0)
							{
								System.out.println("INSIRA O VALOR DO NOVO PRODUTO:");
								M2[P]=leia.nextDouble();
								
									if(M2[P]==0)
									{
										P=20;
										break;
									}
									System.out.println("INSIRA O NOME DO NOVO PRODUTO: ");
									M3[P]=leia.next();
									Novoproduto++;
								System.out.println("Produto Registrado com sucesso.");
								
						}
					}
					
				}
			}else
			{
				Menu=0;
			}
			
		} while(Menu==4);
		
		default:
		{
			System.out.println("C�digo '0' (inicial) inserido. Por favor  consulte o menu e �nsira uma op��o v�lida.\n\t\t Menu de op��es: \n 1- Lista de produtos. \n 2- Nova compra. \n 3- Cobra cliente \n 4- Adiciona novo produto a loja.");
			Menu=leia.nextInt();
		}
		
		
		
		
		
			}
		}
		
	}
}


