#ifndef PRINTER_H
#define PRINTER_H

#include <string>

class Printer {

private:
    static void print(std::string tipoMensagem, std::string message, bool newLine=true);

public:
    static void printMessageInformation(std::string message);
    static void printMessageLog(std::string message);
    static void printMessageAlert(std::string message);
    static void printMessageDanger(std::string message);
    static void printMessageIn(std::string message, bool newLine=false);
    static void printMessageOut(std::string message);

};

#endif