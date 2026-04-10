<?php

class Personagem {
    private $nome;
    private $vida;

    public function __construct($nome, $vida) {
        $this->nome = $nome;
        $this->vida = $vida;
    }

    public function receberDano($valor) {
        $this->vida -= $valor;

        if ($this->vida < 0) {
            $this->vida = 0;
        }
    }

    public function exibirStatus() {
        echo "Personagem: " . $this->nome . "<br>";
        echo "Vida: " . $this->vida . "<br>";
    }
}

$p1 = new Personagem("Mago Azul", 100);
$p1->receberDano(35);
$p1->exibirStatus();

?>