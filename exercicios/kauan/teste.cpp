/* 
#include <QApplication>
#include <QPushButton>

int main(int argc, char *argv[]) {
    QApplication app(argc, argv);

    QPushButton *botao = new QPushButton("Novo botão");

    QObject::connect(botao, &QPushButton::clicked, []() {
        QPushButton *novo = new QPushButton("Outro botão");
        novo->show();
    });

    botao->show();

    return app.exec();
}

*/