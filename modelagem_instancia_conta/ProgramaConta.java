public class ProgramaConta {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(123, "Vitor", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca(456, "Lorran", 1000);

        cc.sacar(1300); // usa limite
        System.out.println(cc.getSaldo());

        cp.setRendimento(0.05);
        cp.aplicarRendimento();
        System.out.println(cp.getSaldo());
    }
}
