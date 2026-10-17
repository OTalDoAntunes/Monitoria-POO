package MonitoriaPOO.Simulado2;

public class ProdutoFisico extends Produto implements Entregavel{
    private double pesoKg;
    private String cepDestino;

    public ProdutoFisico(String codigo, String nome, int estoque, double precoBase, double pesoKg){
        super(codigo, nome, estoque, precoBase);
        this.pesoKg = pesoKg;
    }

    @Override 
    public double calcularPrecoFinal(){
        return getPrecoBase() + (getPrecoBase() * 0.10);
    }

    @Override 
    public double calcularFrete(String cep){
        this.cepDestino = cep;
        return 15 + (2 * this.pesoKg);
    }

    @Override 
    public int prazoEntregaDias(){
        return (this.cepDestino.startsWith("6")) ? 7 : 12;
    }
}
