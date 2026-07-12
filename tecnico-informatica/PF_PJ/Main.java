public class Main {
    public static void main(String[] args) {

        System.out.println("Dados da pessoa física:");
        PessoaFisica pf = new PessoaFisica(
                "Carlos Eduardo",
                "29/05/2008",
                "111.222.333-44",
                'M');
        pf.exibirDados();

        System.out.println("Dados da pessoa jurídica:");
        PessoaJuridica pj = new PessoaJuridica(
                "Tech Solutions Ltda",
                "10/05/2010",
                "12.345.678/0001-99",
                '-');
        pj.exibirDados();

        System.out.println("Atualizando informações: ");

        pf.setNome("Carlos Eduardo da Silva");

        pj.setNome("VirteX");

        System.out.println("Nome atualizado da Pessoa Física: " + pf.getNome());
        System.out.println("Nome atualizado da Pessoa Jurídica: " + pj.getNome());
    }
}