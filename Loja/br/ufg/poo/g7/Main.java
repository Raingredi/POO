package br.ufg.poo.g7;
import java.util.Scanner;

/**
 * Classe que faça a leitura e escrita dos dados cadastrados.
 * 
 * @author Raingredi Mendes 
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Solicita as informações de cadastro da loja para o funcionário
        */
        
        System.out.print("Digite o nome da loja: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CNPJ da loja: ");
        String cnpj = scanner.nextLine();

        System.out.print("Digite o telefone da loja: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o endereço da loja: ");
        String endereco = scanner.nextLine();

        /**
         * Instancia a classe Loja
        */
        Loja loja = new Loja(nome, cnpj, telefone, endereco);

        System.out.print("Quantos serviços a loja oferece? ");
        int quantidadeServicos = scanner.nextInt();
        scanner.nextLine(); 

        String[] servicos = new String[quantidadeServicos];
        for (int i = 0; i < quantidadeServicos; i++) {
            System.out.print("Digite o nome do serviço " + (i + 1) + ": ");
            servicos[i] = scanner.nextLine();
        }
        loja.setServicos(servicos);
        System.out.println("\nInformações da Loja");
        System.out.println("Nome: " + loja.getNome());
        System.out.println("CNPJ: " + loja.getCnpj());
        System.out.println("Telefone: " + loja.getTelefone());
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.print("Serviços oferecidos: ");
        for (String servico : loja.getServicos()) {
            System.out.print(servico + " ");
        }

        scanner.close();
    }
}
