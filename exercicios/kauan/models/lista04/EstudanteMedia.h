#ifndef ESTUDANTEMEDIA_h
#define ESTUDANTEMEDIA_h

#include "utils/ValorString.h"

class EstudanteMedia{
    public:
        ValorString nome;
        double nota;
        EstudanteMedia(ValorString nome, double nota);
};

#endif