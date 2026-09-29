package br.edu.ifpi.Principal;

import java.util.Scanner;
import br.edu.ifpi.DAO.ClienteDAO;
import br.edu.ifpi.Model.Cliente;
import br.edu.ifpi.Model.Endereco;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteDAO clienteDAO = new ClienteDAO();

        while (true) {
            System.out.println("\nSISTEMA IMOBILIÁRIO");
            System.out.println("1 - Criar cliente");
            System.out.println("2 - Buscar cliente por CPF");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.println("-- Endereço --");
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();
                    System.out.print("Bairro: ");
                    String bairro = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();

                    Endereco endereco = new Endereco();
                    endereco.setRua(rua);
                    endereco.setNumero(numero);
                    endereco.setBairro(bairro);
                    endereco.setCidade(cidade);
                    endereco.setCep(cep);

                    Cliente cliente = new Cliente();
                    cliente.setNome(nome);
                    cliente.setCpf(cpf);
                    cliente.setEmail(email);
                    cliente.setEndereco(endereco);

                    clienteDAO.salvar(cliente);
                }
                case 2 -> {
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    Cliente resultado = clienteDAO.buscarPorCpf(cpf);
                    if (resultado != null) {
                        System.out.println("Cliente encontrado:");
                        System.out.println("  ID:    " + resultado.getId());
                        System.out.println("  Nome:  " + resultado.getNome());
                        System.out.println("  CPF:   " + resultado.getCpf());
                        System.out.println("  Email: " + resultado.getEmail());
                        Endereco endereco = resultado.getEndereco();
                        if (endereco != null) {
                            System.out.println("  Endereço: " + endereco.getEndereco());
                        }
                    }
                }
                default -> System.out.println("Opção inválida.");
            }
        }

        clienteDAO.fechar();
        scanner.close();
    }
}
    