#ifndef LISTATAREFA_H
#define LISTATAREFA_H

#include "utils/ValorString.h"
#include "models/lista03/Tarefa.h"
#include "utils/Reader.h"
#include "utils/Printer.h"

#include "vector"
#include <iostream>

class ListaTarefas{
    private:
        std::vector<Tarefa> lista;
        

    public:
        ListaTarefas();
        Tarefa criarTarefa();    

        void adicionarTarefa(Tarefa tarefa);

        void adicionarTarefasPorQuantidade(int quantidade);

        void alterarStatusTarefas();
        
        Tarefa obterTarefaPorIndice(int indice);
};

#endif