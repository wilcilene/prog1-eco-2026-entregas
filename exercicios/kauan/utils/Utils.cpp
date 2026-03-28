

#include "Reader.h"
#include "Printer.h"
#include "Utils.h"
#include "models/lista01/Carro2.h"




void Utils::repitirCarro(Carro2 carro){
    Printer::printMessageIn("Repitir teste de nitro (1)? ");
    int verificaRepitir = Reader::readInt();
    if (verificaRepitir == 1){
        carro.usarNitro();
        repitirCarro(carro);
    }
    carro.desligar();
}