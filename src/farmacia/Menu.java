package farmacia;

import java.util.Scanner;
import farmacia.controller.ProdutoController;
import farmacia.model.Produto;
import farmacia.model.Medicamento;
import farmacia.model.Cosmetico;

public class Menu {
	
	// Classe principal que exibe o menu e controla as ações do sistema

    public static void main(String[] args) {
    	
    	// Método principal que inicia o programa e exibe o menu interativo
    	
        Scanner leia = new Scanner(System.in);
        ProdutoController produtos = new ProdutoController();

        int opcao, id, quantidade;
        String nome;
        float preco;

        while (true) {
            System.out.println("\n===================================");
            System.out.println("      FARMÁCIA - MENU PRINCIPAL    ");
            System.out.println("===================================");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Buscar Produto por ID");
            System.out.println("6 - Cadastrar Medicamento");
            System.out.println("7 - Cadastrar Cosmético");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
               
                	// Cadastra um novo produto genérico
                	
                    System.out.print("ID: ");
                    id = leia.nextInt();
                    leia.nextLine(); // limpar buffer
                    System.out.print("Nome: ");
                    nome = leia.nextLine();
                    System.out.print("Preço: ");
                    preco = leia.nextFloat();
                    System.out.print("Quantidade: ");
                    quantidade = leia.nextInt();

                    Produto novo = new Produto(id, nome, preco, quantidade);
                    produtos.cadastrar(novo);
                    break;

                case 2:
                	
                	// Lista todos os produtos cadastrados

                    produtos.listarTodos();
                    break;

                case 3:
                	
                	// Atualiza os dados de um produto existente

                    System.out.print("ID do produto a atualizar: ");
                    id = leia.nextInt();
                    leia.nextLine();
                    System.out.print("Novo nome: ");
                    nome = leia.nextLine();
                    System.out.print("Novo preço: ");
                    preco = leia.nextFloat();
                    System.out.print("Nova quantidade: ");
                    quantidade = leia.nextInt();

                    Produto atualizado = new Produto(id, nome, preco, quantidade);
                    produtos.atualizar(atualizado);
                    break;

                case 4:
                	
                	// Remove um produto pelo ID
                	
                    System.out.print("ID do produto a remover: ");
                    id = leia.nextInt();
                    produtos.deletar(id);
                    break;

                case 5:
                	
                	// Busca um produto pelo ID

                    System.out.print("ID do produto a buscar: ");
                    id = leia.nextInt();
                    produtos.procurarPorId(id);
                    break;
                    
                case 6:
                	
                	// Cadastra um novo medicamento

                    System.out.print("ID: ");
                    id = leia.nextInt();
                    leia.nextLine(); // limpar buffer
                    System.out.print("Nome: ");
                    nome = leia.nextLine();
                    System.out.print("Preço: ");
                    preco = leia.nextFloat();
                    System.out.print("Quantidade: ");
                    quantidade = leia.nextInt();
                    leia.nextLine(); // limpar buffer
                    System.out.print("Tipo de uso: ");
                    String tipoUso = leia.nextLine();
                    System.out.print("Receita obrigatória (true/false): ");
                    boolean receita = leia.nextBoolean();

                    Medicamento med = new Medicamento(id, nome, preco, quantidade, tipoUso, receita);
                    produtos.cadastrar(med);
                    break;
                    
                case 7:
                	
                	// Cadastra um novo cosmético

                    System.out.print("ID: ");
                    id = leia.nextInt();
                    leia.nextLine(); // limpar buffer
                    System.out.print("Nome: ");
                    nome = leia.nextLine();
                    System.out.print("Preço: ");
                    preco = leia.nextFloat();
                    System.out.print("Quantidade: ");
                    quantidade = leia.nextInt();
                    leia.nextLine(); // limpar buffer
                    System.out.print("Fragrância: ");
                    String fragrancia = leia.nextLine();
                    System.out.print("Tipo de pele: ");
                    String tipoPele = leia.nextLine();

                    Cosmetico cos = new Cosmetico(id, nome, preco, quantidade, fragrancia, tipoPele);
                    produtos.cadastrar(cos);
                    break;

                case 0:
                	
                	// Encerra o programa

                    System.out.println("Encerrando o sistema...");
                    leia.close();
                    System.exit(0);
                    break;

                default:
                	
                	// Mensagem para opção inválida
                	
                    System.out.println("Opção inválida!");
            }
        }
    }
}