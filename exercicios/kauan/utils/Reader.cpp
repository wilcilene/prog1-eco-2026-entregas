#include "utils/Reader.h"
#include "utils/ValorString.h"
#include <iostream>
#include <limits>

std::string Reader::readLineInternal(){
    std::string value;
    std::getline(std::cin, value);
    return value;
}

ValorString Reader::readLine(){
    return ValorString(readLineInternal());
}

int Reader::readInt(){
    int value;
    std::cin >> value;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
    return value;
}

double Reader::readDouble(){
    double value;
    std::cin >> value;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
    return value;
}

ValorString Reader::readWord(){
    std::string value;
    std::cin >> value;
    return ValorString(value);
}