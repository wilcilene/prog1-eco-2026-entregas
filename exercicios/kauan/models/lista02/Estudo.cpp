#include "models/lista02/Estudo.h"
#include "utils/ValorString.h"

Estudo::Estudo(ValorString disciplina, int minutos)
    : disciplina(disciplina), minutos(minutos) {}

ValorString Estudo::obterDisciplina(){
    return this->disciplina;
}

int Estudo::obterMinutos(){
    return this->minutos;
}

ValorString Estudo::obterNivelEstudo(){
    if (this->minutos < 30)
        return ValorString("Bom começo!");
    else if (this->minutos < 60)
        return ValorString("Boa dedicação!");
    return ValorString("Modo focado ativado!");
       
};