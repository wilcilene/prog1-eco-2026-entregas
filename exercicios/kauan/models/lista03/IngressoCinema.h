#ifndef INGRESSOCINEMA_H
#define INGRESSOCINEMA_H

#include "utils/ValorString.h"

class IngressoCinema {
private:
    ValorString filme;
    ValorString horario;
    bool meiaEntrada;

public:
    IngressoCinema(ValorString filme, ValorString horario, bool meiaEntrada);

    ValorString obterFilme();
    ValorString obterHorario();
    bool ehMeiaEntrada();

    double obterValor();
};

#endif