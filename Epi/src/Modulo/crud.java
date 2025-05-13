package crudEpi;

import java.util.ArrayList;
import java.util.Scanner;

public class crud {

    public static void executar(String nome, ArrayList<String> lista, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== Módulo de " + nome + " ===");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Atualizar");
            System.out.println("4. Remover");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1: cadastrar(lista, scanner); break;
                case 2: listar(lista); break;
                case 3: atualizar(lista, scanner); break;
                case 4: remover(lista, scanner); break;
                case 0: System.out.println("Voltando..."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void cadastrar(ArrayList<String> lista, Scanner scanner) {
        String entrada;
        do {
            System.out.print("Digite os dados (ex: Nome - quantidade - descrição): ");
            entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Erro: entrada vazia.");
            }
        } while (entrada.isEmpty());

        lista.add(entrada);
        System.out.println("Cadastro realizado!");
    }

    public static void listar(ArrayList<String> lista) {
        System.out.println("\n=== Lista de Itens ===");
        if (lista.isEmpty()) {
            System.out.println("Nenhum item encontrado.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + " - " + lista.get(i));
            }
        }
    }

    public static void atualizar(ArrayList<String> lista, Scanner scanner) {
        listar(lista);
        if (!lista.isEmpty()) {
            System.out.print("Digite o índice a atualizar: ");
            int i = lerInteiro(scanner);
            if (i >= 0 && i < lista.size()) {
                System.out.print("Digite o novo valor: ");
                String novo = scanner.nextLine().trim();
                if (!novo.isEmpty()) {
                    lista.set(i, novo);
                    System.out.println("Atualizado com sucesso!");
                } else {
                    System.out.println("Erro: valor vazio.");
                }
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }

    public static void remover(ArrayList<String> lista, Scanner scanner) {
        listar(lista);
        if (!lista.isEmpty()) {
            System.out.print("Digite o índice a remover: ");
            int i = lerInteiro(scanner);
            if (i >= 0 && i < lista.size()) {
                String removido = lista.remove(i);
                System.out.println("Removido: " + removido);
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }

    public static int lerInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número: ");
            scanner.nextLine();
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
        return numero;
    }
}
