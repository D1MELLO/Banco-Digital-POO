package com.dio.sergio;

public class CartaoCredito {
    private String numero;
    private double limiteCredito;
    private double saldoDevedor;
    private Conta contaAssociada;

    public CartaoCredito(String numero, double limiteCredito, Conta contaAssociada) {
        this.numero = numero;
        this.limiteCredito = limiteCredito;
        this.saldoDevedor = 0;  // Inicialmente, não há saldo devedor
        this.contaAssociada = contaAssociada;
    }

    public String getNumero() {
        return numero;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= saldoDevedor) {
            saldoDevedor -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de pagamento inválido ou saldo devedor insuficiente.");
        }
    }

    public void realizarCompra(double valor) {
        if (valor > 0 && valor <= (limiteCredito - saldoDevedor)) {
            saldoDevedor += valor;
            System.out.println("Compra de R$" + valor + " realizada com sucesso!");
        } else {
            System.out.println("Limite de crédito insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "numero='" + numero + '\'' +
                ", limiteCredito=" + limiteCredito +
                ", saldoDevedor=" + saldoDevedor +
                '}';
    }
}
