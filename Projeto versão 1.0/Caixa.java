package ProjetoJavaGeneration;

import java.util.Scanner;

public class Caixa extends Produto{
	private boolean abrirCaixa;
	private int qnt;
	private double saldo;
	Scanner ler = new Scanner(System.in);
	Produto produto = new Produto(nomeProduto,valorDoProduto);
	
	
  //CONSTRUTOR
	public Caixa(String[] nomeProduto, double[] valorDoProduto, boolean abrircaixa) {
		//INSTANCIANDO AS VARIAVEIS DA CLASSE
		super(nomeProduto, valorDoProduto);
		this.abrirCaixa = abrircaixa;
	}
	
  //Getters and Setters
	public int getQnt() {
  		return qnt;
  	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}  
	
  // MÉTODOS
	
	public void inserirProduto(int id, int qnt) {
		setSaldo(getSaldo() + (produto.getValorDoProduto(id)*qnt));
	}
	
	public void pagamento(double saldo) {
		System.out.println("\nValor total da compra é de: R$"+getSaldo());
		System.out.println("\nInsira o valor de entrada.");
		
		double pagamento = ler.nextDouble();
		setSaldo(getSaldo()-pagamento);
		
		if (getSaldo() == 0) {
			System.out.println("Compra concluída, volte sempre.");
		} else if (getSaldo()<0) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\nRetorne o troco de: R$"+(-getSaldo()));
			System.out.println("\n\tCompra concluída, volte sempre.");
		}
	}

	public void iniciarVenda() {
		setSaldo(0);
		int x=-1;
		
		System.out.println("Caso deseja finalizar a venda digite -1:");
		
		do{
			System.out.println("Insira o id do produto: ");
			x = ler.nextInt();
			if (x==-1) {
				break;
			}
			System.out.println("Insira a quantidade: ");
			inserirProduto(x,ler.nextInt());
		}while(x!=-1);
		
		pagamento(getSaldo());
	}
	
	public boolean isAbrirCaixa() {
	    return abrirCaixa;
	}
	
	public void setAbrirCaixa(boolean abrirCaixa) {
	    this.abrirCaixa = abrirCaixa;
	    
	    if (isAbrirCaixa()) {
			System.out.println("Caixa Aberto, podemos trabalhar!");
			
			iniciarVenda();
		} else {
     	    System.out.println("Caixa Fechada!");
		}
	}
}
