#include "utils/Printer.h"
#include <iostream>

void Printer::print(const std::string tipoMensagem, const std::string message, bool newLine){
    std::cout << tipoMensagem << ": " << message;
    if (newLine)
        std::cout << std::endl;
}

void Printer::printMessageInformation(const std::string message){
    print("[INFO]", message, true);
}

void Printer::printMessageLog(const std::string message){
    print("[LOG]", message, true);
}

void Printer::printMessageAlert(const std::string message){
    print("[ALERT]", message, true);
}

void Printer::printMessageDanger(const std::string message){
    print("[DANGER]", message, true);
}

void Printer::printMessageIn(const std::string message, bool newLine){
    print("\n[Entrada de dados]", message, newLine);
}

void Printer::printMessageOut(const std::string message){
    print("[Saída de dados]", message, true);
}