public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular != null && titular.length() > 0) {
            this.titular = titular;
        }
    }

    public void setNumero(int numero) {
        if (numero > 99 && numero < 1000) {
            this.numero = numero;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso no valor de: " + valor);
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso no valor de: " + valor);
        } else {
            System.out.println("Valor de saque inválido");
        }
    }

}