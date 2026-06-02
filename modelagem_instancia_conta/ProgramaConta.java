public class ProgramaConta {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(123, "Vitor", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca(456, "Lorran", 1000);

        cc.sacar(1300); // usa limite
        System.out.println(cc.getSaldo());

        cp.setRendimento(0.05);
        cp.aplicarRendimento();
        System.out.println(cp.getSaldo());

        //FUNCIONÁRIOS
        Diretor diretor = new Diretor("Carlos");
        diretor.setSenha(1234);

        System.out.println("\nDiretor autenticado: " + diretor.autenticar(1234));
        System.out.println("Nome: " + diretor.getNome());
        System.out.println("Setor: " + diretor.getSetor());

        Gerente gerente = new Gerente("Ana", "Equipe A");
        gerente.setSenha(5678);

        System.out.println("\nGerente autenticado: " + gerente.autenticar(1111)); // errado
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Equipe: " + gerente.getEquipe());

        //CLIENTE 
        Cliente cliente = new Cliente("João", "123.456.789-00");
        cliente.setSenha(9999);

        System.out.println("\nCliente autenticado: " + cliente.autenticar(9999));
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
    }
}
