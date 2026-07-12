import java.util.ArrayList;
import java.util.List;

public class ListContaMain {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(123, "João", 1000, 500);
        ContaCorrente cc2 = new ContaCorrente(456, "José", 2000, 500);
        ContaCorrente cc3 = new ContaCorrente(789, "Pedro", 3000, 500);

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);

        for (ContaCorrente conta : contas) {
            System.out.println("Número: " + conta.getNumero());
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }
    }
}