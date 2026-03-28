#ifndef READER_H
#define READER_H

#include <string>
#include "ValorString.h"
class Reader {

private:
    static std::string readLineInternal();

public:
    static ValorString readLine();
    static int readInt();
    static double readDouble();
    static ValorString readWord();
};

#endif