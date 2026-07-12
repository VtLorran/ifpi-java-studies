import java.util.Scanner;

public class BancoAgenciaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //BANCO
        System.out.print("Digite o nome do banco: ");
        String nomeBanco = sc.nextLine();

        Banco banco = new Banco(nomeBanco);

        //AGÊNCIAS
        System.out.print("Quantas agências deseja cadastrar? ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nAgência " + (i + 1));

            System.out.print("Número: ");
            int numero = sc.nextInt();
            sc.nextLine(); // limpar buffer

            System.out.print("Cidade: ");
            String cidade = sc.nextLine();

            Agencia agencia = new Agencia(numero, cidade);
            banco.adicionarAgencia(agencia);
        }

        //EXIBIR
        System.out.println("\nBanco: " + banco.getNome());

        for (Agencia a : banco.getAgencias()) {
            System.out.println("Agência: " + a.getNumero() + " - " + a.getCidade());
        }

        sc.close();
    }
}