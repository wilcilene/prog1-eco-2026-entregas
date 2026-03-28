#include "models/lista02/Camiseta.h"

Camiseta::Camiseta(ValorString tamanho, ValorString cor, double preco)
    : tamanho(tamanho), cor(cor), preco(preco) {}

ValorString Camiseta::obterTamanho(){
    return this->tamanho;
}

ValorString Camiseta::obterCor(){
    return this->cor;
}

double Camiseta::obterPreco(){
    return this->preco;
}

ValorString Camiseta::obterCategoria(){
    if (this->obterPreco() > 100)
        return ValorString("Camiseta premium");
    return ValorString("Camiseta padrão");
        
}