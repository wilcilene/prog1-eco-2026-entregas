# Projeto de Exercícios de POO em C++


# 🧠 Estrutura Geral do Projeto

O projeto está organizado em três principais partes:

```
/models - Cada sub-diretório é uma aula
    /lista01
    /lista02
    /lista03
    /lista04

/utils - Classes reutiizadas em diferentes listas com trechos que identifiquei serem muito repititivos

Main.cpp - Arquivo central com a execução de todos os exercícios
```

---

## 🔹 Lista 01 – Fundamentos de Classes

A primeira lista foca nos conceitos mais básicos de POO:


### Exemplos:

* `Carro`
* `Estudante`
* `Livro`
* `Musica`

---

## 🔹 Lista 02 – Regras de Negócio e Métodos

### Exemplos:

* `Cofrinho` → controle de saldo
* `Estudo` → cálculo de nível de estudo
* `Camiseta` → classificação por preço
* `Sala` → análise de temperatura

---

## 🔹 Lista 03 – Coleções e Estruturas Dinâmicas

### Exemplos:

* `ListaTarefas`
* `EstudanteAcademia`
* `IngressoCinema`

---

## 🔹 Lista 04 – Processamento e Estatísticas

### Exemplos:

* `EstudanteMedia`
* `Jogador`

---

# Reutilização com a pasta `utils`

Para evitar repetição de código, foi criada a pasta:

```
/utils
```

Ela centraliza funcionalidades comuns usadas em vários exercícios.
Eu estava cansado de reescrever trechos de entrada e saída de dados com a mesma estrutura idêntica em todos os trechos.



## 📥 Reader (Entrada de dados)

Responsável por capturar dados do usuário:

* `readLine()` → lê texto
* `readInt()` → lê inteiros
* `readDouble()` → lê números decimais

👉 Benefício:

> evita repetir lógica de leitura em todos os exercícios

---

## 📤 Printer (Saída de dados)

Responsável por exibir mensagens no console:

* Mensagens informativas
* Logs
* Alertas
* Entrada e saída formatada

👉 Benefício:

> padroniza a forma como o programa se comunica com o usuário

---

## 🔁 Utils

Classe auxiliar com funções reutilizáveis entre exercícios.

Exemplo:

* Repetição de ações com objetos
* Funções auxiliares específicas

---

## 🔤 ValorString

Uma classe criada para encapsular operações com strings:

* Conversão de tipos (`int`, `double`)
* Manipulação de texto

👉 Objetivo:

> praticar encapsulamento e criação de tipos personalizados

---

# 🎮 Organização do Main.cpp

O arquivo `Main.cpp` funciona como um **controlador central** do projeto.
Ao final do arquivo é delcaradao a função int main() que apenas faz chamaa função estática e pública Main::execute()
Essa função possui a chamada estática e privada de cada exercício, com oo objetivo de permitir um acesso facilitado e centralizado em um único arquivo a execução de todos os exercícios
Assim aplicando conceitos de centralizar o controle nesta classe
---

## 🔹 Estrutura

A classe `Main` possui vários métodos:

```
execute01()
execute02()
...
execute14()
```

Cada método representa um exercício específico.

---

## 🔹 Execução

```cpp
static void execute(){
    //execute01();
    //execute02();
}
```

👉 O usuário escolhe qual exercício rodar descomentando o método desejado.

---

## 🔹 Responsabilidade do Main

O `Main` é responsável por:

* Controlar o fluxo do programa
* Chamar os exercícios
* Interagir com o usuário
* Testar as classes criadas
