package farmacia.repository;

public interface ProdutoRepository {

    public void procurarPorId(int id);
    public void listarTodos();
    public void cadastrar(Object produto);
    public void atualizar(Object produto);
    public void deletar(int id);
}