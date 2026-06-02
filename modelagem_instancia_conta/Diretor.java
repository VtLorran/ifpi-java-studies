public class Diretor extends Funcionario {

    private double bonus;

    public Diretor(String nome) {
        super(nome, "Diretoria");
        this.bonus = 5000;
    }

    public double getBonus() {
        return bonus;
    }
}