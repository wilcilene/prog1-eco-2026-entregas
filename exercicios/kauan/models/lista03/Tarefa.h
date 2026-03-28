#ifndef TAREFA_H
#define TAREFA_H

#include "utils/ValorString.h"

class Tarefa{
    public:
        ValorString titulo;
        ValorString descricao;
        bool concluida;
    
        Tarefa(ValorString titulo, ValorString descricao);
        void alterarStatus();    
};

#endif

