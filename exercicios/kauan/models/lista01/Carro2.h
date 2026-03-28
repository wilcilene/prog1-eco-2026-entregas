#ifndef CARRO2_H
#define CARRO2_H

#include <string>
#include "utils/ValorString.h"
#include <iostream>


class Carro2 {

private:
    ValorString nome;
    int anoModelo;
    int nivelNitro;
    bool ligado;
    bool fantasma;

    void ativarNitro();
public:
    Carro2(ValorString nome, int anoModelo, int nivelNitro, bool ligado);
    void usarNitro();
    void ligar();
    void desligar();
};

#endif