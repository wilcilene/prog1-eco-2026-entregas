#ifndef LIVRO_H
#define LIVRO_H

#include "utils/ValorString.h"

class Livro{
    private:
        ValorString titulo;
        ValorString autor;
        int paginas;

    public:
        Livro(ValorString titulo, ValorString autor, int paginas);
        ValorString obterResumo();

        void alterarNumeroPaginas(int paginas);
};

#endif