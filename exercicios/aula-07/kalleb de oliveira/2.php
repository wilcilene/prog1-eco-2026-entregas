<?php

class ContaEnergia {
    private $titular;
    private $valor;

    public function __construct($titular, $valor) {
        $this->titular = $titular;
        $this->valor = $valor;
    }

    public function aplicarDesconto() {
        if ($this->valor > 200) {
            $this->valor = $this->valor * 0.95;
        }
    }

    public function exibirConta() {
        echo "Titular: " . $this->titular . "<br>";
        echo "Valor final: R$ " . number_format($this->valor, 2, ",", ".") . "<br>";
    }
}

$conta = new ContaEnergia("Juliana", 240.00);
$conta->aplicarDesconto();
$conta->exibirConta();

?>