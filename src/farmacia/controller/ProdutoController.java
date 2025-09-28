package farmacia.controller;

import java.util.ArrayList;
import java.util.Optional;

import farmacia.model.Produto;
import farmacia.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    @Override
    public void procurarPorId(int id) {
        Optional<Produto> produto = listaProdutos.stream()
            .filter(p -> p.getId() == id)
            .findFirst();

        if (produto.isPresent()) {
            produto.get().visualizar();
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    @Override
    public void listarTodos() {
        for (Produto p : listaProdutos) {
            p.visualizar();
        }
    }

    @Override
    public void cadastrar(Object produto) {
        listaProdutos.add((Produto) produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    @Override
    public void atualizar(Object produto) {
        Produto novoProduto = (Produto) produto;
        Optional<Produto> antigoProduto = listaProdutos.stream()
            .filter(p -> p.getId() == novoProduto.getId())
            .findFirst();

        if (antigoProduto.isPresent()) {
            listaProdutos.set(listaProdutos.indexOf(antigoProduto.get()), novoProduto);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto com ID " + novoProduto.getId() + " não encontrado.");
        }
    }

    @Override
    public void deletar(int id) {
        Optional<Produto> produto = listaProdutos.stream()
            .filter(p -> p.getId() == id)
            .findFirst();

        if (produto.isPresent()) {
            listaProdutos.remove(produto.get());
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }
}