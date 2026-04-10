class ItemPedido {
    String nome;
    int quantidade;
    double precoUnitario;

    double calcularTotal() {
        return quantidade * precoUnitario;
    }
}