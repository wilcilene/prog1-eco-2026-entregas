

#include "utils/ValorString.h"
#include "models/lista03/Tarefa.h"
#include "utils/Reader.h"
#include "utils/Printer.h"
#include "models/lista03/ListaTarefas.h"

ListaTarefas::ListaTarefas(){
    this->lista = {};
}

Tarefa ListaTarefas::criarTarefa(){
    Printer::printMessageIn("Informe o título da tarefa: ");
    ValorString titulo = Reader::readLine();

    Printer::printMessageIn("Informe a descrição da tarefa: ");
    ValorString descricao = Reader::readLine();


    return Tarefa(titulo, descricao);


}


void ListaTarefas::adicionarTarefa(Tarefa tarefa){
    this->lista.push_back(tarefa);
}


void ListaTarefas::adicionarTarefasPorQuantidade(int quantidade){
    for (int i = 1; i <= quantidade; i++){
        this->adicionarTarefa(this->criarTarefa());
        Printer::printMessageLog("Adicionado tarefa "  + ValorString::intParaString(i).str());};
}   


void ListaTarefas::alterarStatusTarefas(){
    bool continuar = true;
    while(continuar){
        Printer::printMessageIn("Deseja alterar o status de qual tarefa agora: ");
        int numero = Reader::readInt();
        if (numero >= 0 && static_cast<size_t>(numero) < this->lista.size())
            this->lista[numero].alterarStatus();
        else
            continuar = false;
    }
}
    
Tarefa ListaTarefas::obterTarefaPorIndice(int indice){
    return this->lista[indice];
}
