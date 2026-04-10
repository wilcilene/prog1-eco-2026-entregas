package Lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

class ItemPedido {
    String nome;
    int quantidade;
    double precoUnitario;

    double calcularTotal() {
        return quantidade * precoUnitario;
    }
}