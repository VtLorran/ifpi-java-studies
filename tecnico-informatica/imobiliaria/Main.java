public class Main {
    public static void main(String[] args) {
        System.out.println("Teste do sistema imobiliário: ");

        // Endereços:
        Endereco enderecoCasa = new Endereco("Rua Principal", "123", "Centro", "Isaías Coelho", "64550-000");

        Endereco enderecoApartamento = new Endereco("Avenida Brasil", "456", "Bairro Novo", "Picos", "64600-000");

        // Clientes:
        Cliente cliente1 = new Cliente("Vítor Lorran", "111.222.333-44", "vitor@email.com");

        Cliente cliente2 = new Cliente("Ricardo", "222.333.444-55", "ricardo@email.com");

        Cliente cliente3 = new Cliente("Niccolly", "333.444.555-66", "niccolly@email.com");

        // Corretores:
        Corretor corretora1 = new Corretor("Anna Júlya", "444.555.666-77", "CRECI-123");
        Corretor corretora2 = new Corretor("Mafe", "555.666.777-88", "CRECI-456");

        // Criando imóveis:
        Casa casa = new Casa(1, enderecoCasa, 250000.0, 3);
        Apartamento apartamento = new Apartamento(2, enderecoApartamento, 180000.0, 10, 600.0);

        // exibir detalhes dos imóveis

        // Casa:
        System.out.println("\nDetalhes da casa: ");
        casa.exibirDetalhes();
        System.out.println("Comissão da casa: R$ " + casa.calcularComissao());

        // Apartamento
        System.out.println("\nDetalhes do apartamento: ");
        apartamento.exibirDetalhes();
        System.out.println("Comissão do apartamento: R$ " + apartamento.calcularComissao());

        // Venda da casa:
        System.out.println("\nRealizando Venda:");
        Contrato contratoCasa = casa.vender(cliente1, corretora1);
        contratoCasa.imprimir();

        // Teste de venda duplicada
        System.out.println("\nTestando bloqueio de venda duplicada:");
        try {
            casa.vender(cliente2, corretora2);
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado ao vender novamente: " + e.getMessage());
        }

        // Alugando Apartamento
        System.out.println("\nRealizando Aluguel");
        Contrato contratoApartamento = apartamento.alugar(cliente3, corretora2);
        contratoApartamento.imprimir();

        System.out.println("\nStatus Final dos Imóveis:");
        System.out.println("Status final da casa: " + (casa.isDisponivel() ? "disponível" : "indisponível"));
        System.out.println(
                "Status final do apartamento: " + (apartamento.isDisponivel() ? "disponível" : "indisponível"));
    }
}