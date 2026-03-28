#ifndef VALORSTRING_H
#define VALORSTRING_H

#include <string>

class ValorString{

    private:
        std::string texto;

    public:
        ValorString(); // construtor vazio
        ValorString(std::string texto);
        std::string str();

        static ValorString intParaString(int numero);

        static ValorString doubleParaString(double numero);
};

#endif