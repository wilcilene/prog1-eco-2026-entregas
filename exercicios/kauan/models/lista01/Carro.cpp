
#include "utils/Printer.h"
#include "models/lista01/Carro.h"


Carro::Carro(std::string nome, int anoModelo, int nivelNitro){
    this->nome = nome;
    this->anoModelo = anoModelo;

    if (nivelNitro <= 0 || nivelNitro >= 100)
        this->nivelNitro = 0;
    else
        this->nivelNitro = nivelNitro;
}

void Carro::usarNitro(){
    Printer::printMessageInformation("Nitro Ativado!");
    ativarNitro();
}

void Carro::ativarNitro(){
    for (int i = this->nivelNitro; i >= 0; i--)
        Printer::printMessageAlert("Nível do nitro baixando ["+std::to_string(i)+"]");
    Printer::printMessageInformation("Zerou o nitro");
    nivelNitro = 0;
}