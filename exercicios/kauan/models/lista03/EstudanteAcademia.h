#ifndef ESTUDANTEACADEMIA_H
#define ESTUDANTEACADEMIA_H

#include "utils/ValorString.h"

class EstudanteAcademia {
public:
    ValorString nome;
    int frequenciaSemanal;

    EstudanteAcademia(ValorString nome, int frequenciaSemanal);
};

#endif