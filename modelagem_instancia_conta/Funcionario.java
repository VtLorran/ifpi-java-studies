public class Funcionario {

    private String nome;
    private String setor;
    private int senha;

    public Funcionario(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
}