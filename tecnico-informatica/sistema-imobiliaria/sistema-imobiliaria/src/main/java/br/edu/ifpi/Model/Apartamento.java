package br.edu.ifpi.Model;

import java.time.LocalDate;
import br.edu.ifpi.Enumerates.TipoContrato;

public class Apartamento extends Imovel {
    private int andar;
    private double valorCondominio;

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Andar: " + this.andar);
        System.out.println("Valor do Condomínio: R$ " + this.valorCondominio);
    }

    public Contrato vender(Cliente cliente, Corretor corretor, TipoContrato tipoContrato, double valor) {
        if (!this.isDisponivel()) {
            System.out.println("Erro: Este apartamento não está disponível para venda.");
            return null; // Evita criar contrato se estiver indisponível
        }

        Contrato novoContrato = new Contrato();

        int idAtual = Contrato.getProximoId();
        novoContrato.setId(idAtual);
        Contrato.setProximoId(idAtual + 1);

        novoContrato.setImovel(this);
        novoContrato.setCliente(cliente);
        novoContrato.setCorretor(corretor);
        novoContrato.setData(LocalDate.now());
        novoContrato.setTipo(tipoContrato);
        novoContrato.setValorFinal(valor);

        this.setDisponivel(false);

        return novoContrato;
    }

    public Contrato alugar(Cliente cliente, Corretor corretor) {
        if (!this.isDisponivel()) {
            throw new IllegalStateException("Erro: Este apartamento não está disponível para aluguel.");
        }

        double valorAluguel = (this.getValor() * 0.05) + this.valorCondominio;

        Contrato novoContrato = new Contrato();

        int idAtual = Contrato.getProximoId();
        novoContrato.setId(idAtual);
        Contrato.setProximoId(idAtual + 1);

        novoContrato.setImovel(this);
        novoContrato.setCliente(cliente);
        novoContrato.setCorretor(corretor);
        novoContrato.setData(LocalDate.now());
        novoContrato.setTipo(TipoContrato.ALUGUEL);
        novoContrato.setValorFinal(valorAluguel); // Usa o valor retornado do cálculo com o condomínio

        this.setDisponivel(false);

        return novoContrato;
    }

    public double calcularComissao() {
        return this.getValor() * 0.06;
    }
}