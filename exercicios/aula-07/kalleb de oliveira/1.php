<?php

class Estudante
{
    private $nome;
    private $curso;

    public function __construct($nome, $curso)
    {
        $this->nome  = $nome;
        $this->curso = $curso;
    }

    public function exibirDados()
    {
        echo "Estudante: " . $this->nome . "<br>";
        echo "Curso: " . $this->curso . "<br>";
    }
}

$estudante1 = new Estudante("Carlos", "Engenharia de Computação");
$estudante1->exibirDados();

?>