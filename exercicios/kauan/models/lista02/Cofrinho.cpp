#include "models/lista02/Cofrinho.h"
#include "utils/ValorString.h"

Cofrinho::Cofrinho(ValorString nomeDono, double saldo) : nomeDono(nomeDono), saldo(saldo){}

ValorString Cofrinho::obterNomeDono(){
    return this->nomeDono;
};

double Cofrinho::obterSaldo(){
    return this->saldo;
};
