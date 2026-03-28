
#include "models/lista03/Tarefa.h"

#include "utils/ValorString.h"

Tarefa::Tarefa(ValorString titulo, ValorString descricao) :titulo(titulo), descricao(descricao), concluida(false){}

void Tarefa::alterarStatus(){
    this->concluida = !this->concluida;
}