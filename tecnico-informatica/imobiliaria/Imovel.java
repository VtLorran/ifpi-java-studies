public class Imovel {
    private int id;
    private double valor;
    private Endereco endereco;
    private boolean disponivel;


    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes sobre imóvel:");
        System.out.println("ID: " + id);
        System.out.println("Endereço: " + endereco.getEndereco());
        System.out.println("Valor: " + valor);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public int getId() {
        return this.id;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public double getValor() {
        return this.valor;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
