public class ProgramaConta {
    public static void main(String[] args) {
        Conta p1Conta = new Conta(7, "Vítor Lorran", 1200);

        System.out.println(p1Conta.getTitular());
        System.out.println(p1Conta.getSaldo());
        System.out.println(p1Conta.getNumero());

        p1Conta.setNumero(777);
        p1Conta.setTitular("De Arrascaeta");

        System.out.println();

        p1Conta.depositar(100);

        System.out.println();

        System.out.println(p1Conta.getTitular());
        System.out.println(p1Conta.getNumero());
        System.out.println(p1Conta.getSaldo());

        System.out.println();

        p1Conta.sacar(400);

        System.out.println(p1Conta.getSaldo());

    }
}
