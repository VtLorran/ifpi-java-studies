public class Gerente extends Funcionario {

    private String equipe;

    public Gerente(String nome, String equipe) {
        super(nome, "Gerência");
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }
}