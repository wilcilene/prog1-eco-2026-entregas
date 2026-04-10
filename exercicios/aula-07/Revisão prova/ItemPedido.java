public class ItemPedido {

    private String nome;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nome, int quantidade, double precoUnitario) {
        this.nome          = nome;
        this.quantidade    = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String  getNome()             {return nome;}
    public int     getQuantidade()       {return quantidade;}
    public double getPrecoUnitario()     {return precoUnitario;}
    
    public double getSubtotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return String.fortmat("%-20s qtd: %3d  unit: R$ %7.2f subtotal: R$ %8.2f",
            nome, quantidade, precoUnitario, getSubtotal());
    }
}
