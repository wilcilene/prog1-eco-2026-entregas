#include "Estudante.h"
#include "utils/ValorString.h"

#include "models/lista01/Estudante.h"

Estudante::Estudante(ValorString nome, ValorString matricula): nome(nome), matricula(matricula) {}

ValorString Estudante::obterMatricula(){ return matricula; }
ValorString Estudante::obterNome(){ return nome; }