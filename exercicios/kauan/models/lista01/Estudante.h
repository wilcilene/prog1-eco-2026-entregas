#ifndef ESTUDANTE_H
#define ESTUDANTE_H
#include "utils/ValorString.h"
#include <string>
#include <iostream>

class Estudante{

    private: ValorString nome;
    private: ValorString matricula;

    public: 
        Estudante(ValorString nome, ValorString matricula);

        ValorString obterMatricula();
        ValorString obterNome();
};


#endif