#include "IngressoCinema.h"

IngressoCinema::IngressoCinema(ValorString filme, ValorString horario, bool meiaEntrada)
    : filme(filme), horario(horario), meiaEntrada(meiaEntrada) {}

ValorString IngressoCinema::obterFilme(){
    return this->filme;
}

ValorString IngressoCinema::obterHorario(){
    return this->horario;
}

bool IngressoCinema::ehMeiaEntrada(){
    return this->meiaEntrada;
}

double IngressoCinema::obterValor(){
    return this->meiaEntrada ? 15.0 : 30.0;
}