public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(String rua, String numero, String bairro, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getEndereco() {
        return this.rua + ", " +
                this.numero + ", " +
                this.bairro + ", " +
                this.cidade + ", CEP: " +
                this.cep;
    }
}
