public class PessoaFisica extends Pessoa {
    private String cpf;
    private char sexo;

    public PessoaFisica(String nome, String dataNascimento, String cpf, char sexo) {
        super(nome, dataNascimento);

        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); 
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
    }

}
