package ProjetoJavaGeneration;

import java.util.Scanner;

/*Classe responsavel por:
 * - Realizar as vendas
 * - Realizar pagamentos e calculo do troco
 * */ 

public class Caixa extends Produto{
	private boolean abrirCaixa; // Variavel responsavel por definir a abertura e fechamento do caixa
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
	
  // M�TODOS
	
	// Realiza o calculo do saldo que o cliente dever� pagar em rela��o a quantidade e tipos de produtos comprados
	public void inserirProduto(int id, int qnt) { 
		if (qnt < 0) {
			System.out.println("Quantidade invalida");
		} else {
			setSaldo(getSaldo() + (produto.getValorDoProduto(id)*qnt));	
		}

	}
	
	// Informa o valor a ser pago e realiza o calculo do troco se necessario
	// Fun��o ir� retornar 1 caso a compra seja concluida corretamente
	// Fun��o ir� retornar 0 caso a compra n�o seja concluida corretamente
	public int pagamento(double saldo) { 
		System.out.println("\nValor total da compra � de: R$"+getSaldo());
		System.out.println("\nInsira o valor pago.");
		
		double pagamento = ler.nextDouble();
		setSaldo(getSaldo()-pagamento);
		
		if (getSaldo() == 0) { //Cliente pagou a quantidade exata
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Compra conclu�da, volte sempre.");
			return 1;
			
		} else if (getSaldo()<0) {//Cliente pagou a mais, � necessario troco
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\nRetorne o troco de: R$"+(-getSaldo()));
			System.out.println("\nCompra conclu�da, volte sempre.");
			return 1;
		} else {//Cliente pagou menos, compra n�o efetuada
			System.out.println("\nQuantidade insuficiente, falta a ser pago: R$"+getSaldo());
			return 0;
		}
	}

	// Inicia uma nova venda
	public int iniciarVenda() { 
		setSaldo(0);
		int id=-1;
		
		// Recebe consecutivamente o id do produto comprado e sua quantidade at� "End of File"
		System.out.println("Quando for finalizar a venda, porfavor digite -1:"); 
		
		do{
			System.out.println("Insira o id do produto: ");
			id = ler.nextInt();
			// Caso o funcionario digite -1 a venda ser� finalizada antes mesmo de ser digitado a quantidade
			if (id==-1) { 
				break;
			}
			//N�o h� necessidade de cancelar a venda no momento de insetir a quantidade pois o funcionario pode digitar 0 e assim n�o ser� computado no saldo final
			System.out.println("Insira a quantidade: ");
			inserirProduto(id,ler.nextInt()); 
		}while(id!=-1);
		
		//Saldo final = 0, portanto n�o ouve compra
		if (getSaldo()==0) {
			System.out.println("Compra n�o efetuada");
			return 0;
		}
		//Envia o saldo final da compra para o metodo pagamento
		return pagamento(getSaldo()); 
	}
	
	// Retorna o estado atual da Caixa
	public boolean isAbrirCaixa() { 
	    return abrirCaixa;
	}
	
	// Redefine o estado da caixa (true = Aberto) (false = Fechado)
	public void setAbrirCaixa(boolean abrirCaixa) { 
		
	    this.abrirCaixa = abrirCaixa;
	    
	    if (isAbrirCaixa()) {
			System.out.println("Caixa Aberto, podemos trabalhar!");
		} else {
     	    System.out.println("Caixa Fechada!");
		}
	}
}
