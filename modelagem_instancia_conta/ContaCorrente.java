public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo + this.limite) {
            this.saldo -= valor;
            System.out.println("Saque com limite realizado");
        } else {
            System.out.println("Saldo + limite insuficiente");
        }
    }
}