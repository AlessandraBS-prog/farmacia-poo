package farmacia.model;

public class Medicamento extends Produto {

    private String tipoUso;
    private boolean receitaObrigatoria;

    public Medicamento(int id, String nome, float preco, int quantidade, String tipoUso, boolean receitaObrigatoria) {
        super(id, nome, preco, quantidade);
        this.tipoUso = tipoUso;
        this.receitaObrigatoria = receitaObrigatoria;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public boolean isReceitaObrigatoria() {
        return receitaObrigatoria;
    }

    public void setReceitaObrigatoria(boolean receitaObrigatoria) {
        this.receitaObrigatoria = receitaObrigatoria;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Tipo de uso: " + tipoUso + " | Receita obrigatória: " + (receitaObrigatoria ? "Sim" : "Não"));
    }
}