package farmacia.model;

public class Cosmetico extends Produto {

    private String fragrancia;
    private String tipoPele;

    public Cosmetico(int id, String nome, float preco, int quantidade, String fragrancia, String tipoPele) {
        super(id, nome, preco, quantidade);
        this.fragrancia = fragrancia;
        this.tipoPele = tipoPele;
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Fragrância: " + fragrancia + " | Tipo de pele: " + tipoPele);
    }
}