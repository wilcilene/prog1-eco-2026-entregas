#ifndef COFRINHO_H
#define COFRINHO_H

#include "utils/ValorString.h"

class Sala{
    private:
        ValorString nome;
        double temperatura;

    public:
        Sala(ValorString nome, double temperatura);
        ValorString obterNome();
        double obterTemperatura();

};

#endif