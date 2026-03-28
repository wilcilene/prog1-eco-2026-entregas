#include "utils/ValorString.h"
#include "Jogador.h"

Jogador::Jogador() : nome(""), pontuacao(0) {}

Jogador::Jogador(ValorString nome, int pontuacao)
    : nome(nome), pontuacao(pontuacao) {}

ValorString Jogador::obterNome(){
    return this->nome;
}

int Jogador::obterPontuacao(){
    return this->pontuacao;
}