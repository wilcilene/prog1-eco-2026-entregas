#ifndef JOGADOR_H
#define JOGADOR_H

#include "utils/ValorString.h"

class Jogador {
private:
    ValorString nome;
    int pontuacao;

public:
    Jogador();
    Jogador(ValorString nome, int pontuacao);

    ValorString obterNome();
    int obterPontuacao();
};

#endif