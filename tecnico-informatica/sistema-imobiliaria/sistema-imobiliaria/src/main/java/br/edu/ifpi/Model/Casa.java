package br.edu.ifpi.Model;

import java.time.LocalDate;

import br.edu.ifpi.Enumerates.TipoContrato;

public class Casa extends Imovel {
    private int numeroQuartos;

    public Contrato vender(Cliente cliente, Corretor corretor, TipoContrato tipoContrato, double valor) {
        if (!this.isDisponivel()) {
            System.out.println("Erro: Esta casa não está disponível para venda.");
        }

        Contrato novoContrato = new Contrato();

        int idAtual = Contrato.getProximoId();
        novoContrato.setId(idAtual);
        Contrato.setProximoId(idAtual + 1);

        novoContrato.setImovel(this);
        novoContrato.setCorretor(corretor);
        novoContrato.setCliente(cliente);
        novoContrato.setTipo(tipoContrato);
        novoContrato.setData(LocalDate.now());
        novoContrato.setValorFinal(valor);
        ;

        this.setDisponivel(false);

        return novoContrato;
    }

    public Contrato alugar(Cliente cliente, Corretor corretor) {
        if (!this.isDisponivel()) {
            throw new IllegalStateException("Erro: Esta casa não está disponível para aluguel.");
        }

        double valorAluguel = this.getValor() * 0.05;

        Contrato novoContrato = new Contrato();

        int idAtual = Contrato.getProximoId();
        novoContrato.setId(idAtual);
        Contrato.setProximoId(idAtual + 1);

        novoContrato.setImovel(this);
        novoContrato.setCliente(cliente);
        novoContrato.setCorretor(corretor);
        novoContrato.setTipo(TipoContrato.ALUGUEL);
        novoContrato.setData(LocalDate.now());
        novoContrato.setValorFinal(valorAluguel);

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