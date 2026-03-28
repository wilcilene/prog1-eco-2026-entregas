
#include "utils/Printer.h"
#include "models/lista01/Carro2.h"
#include "utils/ValorString.h"

#include <iostream>
#include <string>

Carro2::Carro2(ValorString nome, int anoModelo, int nivelNitro, bool ligado) :nome(nome){
    this->ligado = ligado;
    this->fantasma = !ligado;
    this->nome = nome;
    this->anoModelo = anoModelo;

    if (nivelNitro <= 0 || nivelNitro >= 100)
        this->nivelNitro = 0;
    else
        this->nivelNitro = nivelNitro;
}

    void Carro2::ligar(){
        Printer::printMessageInformation("Carro "  + this->nome.str() +" está sendo ligado");
        Printer::printMessageInformation("Ano:  " + std::to_string(this->anoModelo));
    };
    void Carro2::desligar(){
        Printer::printMessageInformation("Carro "  + this->nome.str() +" está sendo desligado");
    };
    void Carro2::usarNitro(){
        if (this->fantasma){
            Printer::printMessageLog("Carro fantasma apareceu do nada!");
        }
        Printer::printMessageInformation("Nitro Ativado!");
        ativarNitro();
    }

    void Carro2::ativarNitro(){
        for (int i = this->nivelNitro; i >= 0; i--)
            Printer::printMessageAlert("Nível do nitro baixando ["+std::to_string(i)+"]");
        Printer::printMessageInformation("Zerou o nitro");
        
    }