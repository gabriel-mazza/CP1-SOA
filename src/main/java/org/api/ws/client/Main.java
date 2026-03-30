package org.api.ws.client;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SistemaWSImplService service = new SistemaWSImplService();
        SistemaWS port = service.getSistemaWSImplPort();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========================================");
            System.out.println("       SISTEMA ERP - CLIENTE SOAP       ");
            System.out.println("========================================");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Cadastrar Cliente");
            System.out.println("4 - Listar Clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastrar Produto ---");
                    Produto produto = new Produto();
                    System.out.print("Nome: ");
                    produto.setNome(scanner.nextLine());
                    System.out.print("Preco: ");
                    produto.setPreco(scanner.nextDouble());
                    System.out.print("Quantidade em estoque: ");
                    produto.setQuantidadeEstoque(scanner.nextInt());
                    scanner.nextLine();
                    port.cadastrarProduto(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Produtos ---");
                    List<Produto> produtos = port.listarProdutos();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto p : produtos) {
                            System.out.println("- " + p.getNome() +
                                    " | R$ " + p.getPreco() +
                                    " | Estoque: " + p.getQuantidadeEstoque());
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Cadastrar Cliente ---");
                    Cliente cliente = new Cliente();
                    System.out.print("Nome: ");
                    cliente.setNome(scanner.nextLine());
                    System.out.print("Email: ");
                    cliente.setEmail(scanner.nextLine());
                    System.out.print("Telefone: ");
                    cliente.setTelefone(scanner.nextLine());
                    port.cadastrarCliente(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("\n--- Lista de Clientes ---");
                    List<Cliente> clientes = port.listarClientes();
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Cliente c : clientes) {
                            System.out.println("- " + c.getNome() +
                                    " | " + c.getEmail() +
                                    " | Tel: " + c.getTelefone());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}