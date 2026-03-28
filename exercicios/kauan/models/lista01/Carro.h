#ifndef CARPLAYER_H
#define CARPLAYER_H

#include <string>

class Carro {

private:
    std::string nome;
    int anoModelo;
    int nivelNitro;

    void ativarNitro();

public:
    Carro(std::string nome, int anoModelo, int nivelNitro);
    void usarNitro();

};

#endif