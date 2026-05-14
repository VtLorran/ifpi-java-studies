public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void aplicarRendimento() {
        this.saldo += this.saldo * rendimento;
    }
}