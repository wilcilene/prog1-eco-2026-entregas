#ifndef MUSICA_H
#define MUSICA_H

#include "utils/ValorString.h"

class Musica{
    public:
        ValorString titulo;
        ValorString artista;
        int duracaoEmSegundos;  
        Musica(ValorString titulo, ValorString artista, int duracaoEmSegundos);

};


#endif