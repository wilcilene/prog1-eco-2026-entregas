package exercicio3;

import java.util.Scanner;

class Cadastro {

    public static void main(String[] args) {
        cadastrar();
    }

    static void cadastrar() {
        Student newStudent = new Student();
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        newStudent.name = entradaDados.nextLine();
        System.out.println("Digite a matricula do estudante:");
        newStudent.matricula = entradaDados.nextLine();
        System.out.println("Digite a classe do estudante:");
        newStudent.classe = entradaDados.nextLine();
        System.out.println("Digite a data de nacimento do estudante:");
        newStudent.nacimento = entradaDados.nextLine();
        System.out.println("o nome do aluno e :" + newStudent.name);
        System.out.println("a matricula do aluno e :" + newStudent.matricula);
        System.out.println("a classe do aluno e :" + newStudent.classe);
        System.out.println(
            "a data de nacimento do aluno e :" + newStudent.nacimento
        );
    }

    /*static void show() {
        System.out.println("o nome do aluno e :" + x); ver depois
        }*/
}
