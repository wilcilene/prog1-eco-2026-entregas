#include "models/lista01/Livro.h"

#include "utils/ValorString.h"


Livro::Livro(ValorString titulo, ValorString autor, int paginas):titulo(titulo), autor(autor), paginas(paginas){}

ValorString Livro::obterResumo(){
            return ValorString("O livro " + this->titulo.str() + " escrito pela autora " + this->autor.str() + " possui " + ValorString::intParaString(this->paginas).str() + " páginas");
        }



void Livro::alterarNumeroPaginas(int paginas){
    this->paginas = paginas;
}