#ifndef ESTUDO_H
#define ESTUDO_H

#include "utils/ValorString.h"

class Estudo{
private:
    ValorString disciplina;
    int minutos;

public:
    Estudo(ValorString disciplina, int minutos);

    ValorString obterDisciplina();
    int obterMinutos();
    ValorString obterNivelEstudo();
};


#endif