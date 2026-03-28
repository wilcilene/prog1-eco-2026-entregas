#include <string>

#include "utils/ValorString.h"

ValorString::ValorString() : texto("") {}

ValorString::ValorString(std::string texto){
    this->texto = texto;
}

std::string ValorString::str(){
    return this->texto;
}

ValorString ValorString::intParaString(int numero){
    return ValorString(std::to_string(numero));
}
ValorString ValorString::doubleParaString(double numero){
    return ValorString(std::to_string(numero));
}