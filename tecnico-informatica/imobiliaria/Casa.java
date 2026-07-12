import java.time.LocalDate;

public class Casa extends Imovel {
    private int numeroQuartos;

    public Contrato vender(Cliente cliente, Corretor corretor) {
        if (!this.isDisponivel()) {
            System.out.println("Erro: Esta casa não está disponível para venda.");
        }

        Contrato novoContrato = new Contrato(this, cliente, corretor, this.getValor(), TipoContrato.VENDA,
                LocalDate.now());

        this.setDisponivel(false);

        return novoContrato;
    }

    public Contrato alugar(Cliente cliente, Corretor corretor) {
        if (!this.isDisponivel()) {
            throw new IllegalStateException("Erro: Esta casa não está disponível para aluguel.");
        }

        double valorAluguel = this.getValor() * 0.05;

        Contrato novoContrato = new Contrato(this, cliente, corretor, valorAluguel, TipoContrato.ALUGUEL,
                LocalDate.now());

        this.setDisponivel(false);

        return novoContrato;
    }

    public double calcularComissao() {
        return this.getValor() * 0.05;
    }

    public int getNumeroQuartos() {
        return this.numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }
}