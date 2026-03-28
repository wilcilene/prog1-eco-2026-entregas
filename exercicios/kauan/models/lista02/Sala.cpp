#include "models/lista02/Sala.h"
#include "utils/ValorString.h"


Sala::Sala(ValorString nome, double temperatura) : nome(nome), temperatura(temperatura){};

ValorString Sala::obterNome(){
    return this->nome;
}


double Sala::obterTemperatura(){
    return this->temperatura;
}


