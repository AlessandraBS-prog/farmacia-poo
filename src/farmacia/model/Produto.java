package farmacia.model;

public class Produto {
    private int id;
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(int id, String nome, float preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public float getPreco() { return preco; }
    public void setPreco(float preco) { this.preco = preco; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void visualizar() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Preço: R$" + preco + " | Estoque: " + quantidade);
    }
}