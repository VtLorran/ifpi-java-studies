import java.time.LocalDate;

public class Apartamento extends Imovel {
    private int andar;
    private double valorCondominio;

    public Apartamento(int id, Endereco endereco, double valor, int andar, double valorCondominio) {
        super(id, valor, endereco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Andar: " + this.andar);
        System.out.println("Valor do Condomínio: R$ " + this.valorCondominio);
    }

    public Contrato vender(Cliente cliente, Corretor corretor) {
        if (!this.isDisponivel()) {
            throw new IllegalStateException("Erro: Este apartamento não está disponível para venda.");
        }

        Contrato novoContrato = new Contrato(this, cliente, corretor, this.getValor(), TipoContrato.VENDA,
                LocalDate.now());

        this.setDisponivel(false);

        return novoContrato;
    }

    public Contrato alugar(Cliente cliente, Corretor corretor) {
        if (!this.isDisponivel()) {
            throw new IllegalStateException("Erro: Este apartamento não está disponível para aluguel.");
        }

        double valorAluguel = (this.getValor() * 0.05) + this.valorCondominio;

        Contrato novoContrato = new Contrato(this, cliente, corretor, valorAluguel, TipoContrato.ALUGUEL,
                LocalDate.now());

        this.setDisponivel(false);

        return novoContrato;
    }

    public double calcularComissao() {
        return this.getValor() * 0.06;
    }

}