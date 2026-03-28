#ifndef CAMISETA_H
#define CAMISETA_H

#include "utils/ValorString.h"

class Camiseta{
private:
    ValorString tamanho;
    ValorString cor;
    double preco;

public:
    Camiseta(ValorString tamanho, ValorString cor, double preco);

    ValorString obterTamanho();
    ValorString obterCor();
    double obterPreco();
    ValorString obterCategoria();
};

#endif