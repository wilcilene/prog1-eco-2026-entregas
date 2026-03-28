#ifndef COFRINHO_H
#define COFRINHO_H


#include "utils/ValorString.h"

class Cofrinho{
    private:
        ValorString nomeDono;
        double saldo;

    public:
        Cofrinho(ValorString nomeDono, double saldo);

        ValorString obterNomeDono();
        double obterSaldo();
};


#endif