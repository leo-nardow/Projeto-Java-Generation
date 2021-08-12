package projeto1;

public class  Mercado {

    protected int valorDoProduto;
    protected String ListaProduto;

    public Mercado (int valorDoProduto, String ListaProduto )
        {
            this.valorDoProduto = valorDoProduto;
            this.ListaProduto = ListaProduto;
        }

    public int getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(int valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public String getListaProduto() {
        return ListaProduto;
    }

    public void setListaProduto(String listaProduto) {
        this.ListaProduto = listaProduto;
    }

    public int valorDoProduto(int valorDoProduto){
         return this.valorDoProduto;
    }

}


