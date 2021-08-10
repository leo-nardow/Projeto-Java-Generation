package projeto1;

//Galera fiz uma alteração no projeto.
//Em vez de usar do conceito de classes abstratas, eu parti do principio de Super Classe Mercado e classe herdeira Caixa
//
//Funcionalidades da Super Classe Mercado
//valorDoProduto;
//ListaProduto;
//Funcionalidades da Classe extends Caixa
//abrirCaixa; ( lembrando que a ideia é somente iniciar compra se e somente se abrirCaixa for true)
//iniciaCompra;
//
//O que Falta
//Implementação dos métodos da classe Caixa
//exibeValor
//exibeListaProduto
//iniciaCompra
//o main do projeto ( para inicializar o sistema)


public class Caixa extends Mercado{
    private boolean abrirCaixa;
    private String iniciaCompra;




    //CONSTRUTOR

    public Caixa(int valorDoProduto,String iniciaCompra,String ListaProduto, boolean abrircaixa)

    //INSTANCIANDO AS VARIAVEIS DA CLASSE
    {
        super(valorDoProduto, ListaProduto);
        this.iniciaCompra = iniciaCompra;
        this.abrirCaixa = abrircaixa;
    }

    // MÉTODOS

    public int exibeValor (int valorProduto)
    {
        return valorDoProduto;
    }
    public String exibeListaProduto (String ListaProduto)
    {
        return ListaProduto;
    }
    public String getIniciaCompra() {
        return iniciaCompra;
    }

    public void setIniciaCompra(String iniciaCompra)
    {
        this.iniciaCompra = iniciaCompra;
    }


    public boolean isAbrirCaixa() {
        return abrirCaixa;
    }

    public void setAbrirCaixa(boolean abrirCaixa) {
        this.abrirCaixa = abrirCaixa;
    }

    public void caixaAberto (){
        if (this.abrirCaixa == true)
        {
            System.out.println("Caixa Aberto, podemos trabalhar!");
        }
        else
        {
            System.out.println("Caixa Fechada!");
        }
    }


    public void fecharCaixar()
    {
        if(this.abrirCaixa == false){
            System.out.println("Caixa Fechado");
        }
    }
}
