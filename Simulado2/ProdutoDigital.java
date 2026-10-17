package MonitoriaPOO.Simulado2;

public class ProdutoDigital extends Produto{
    private int tamanhoMB;
    
    public ProdutoDigital(String codigo, String nome, int estoque, double precoBase, int tamanhoMB){
        super(codigo, nome, estoque, precoBase);
        this.tamanhoMB = tamanhoMB;
    }

    @Override 
    public double calcularPrecoFinal(){
        return getPrecoBase() - (getPrecoBase() * 0.05);
    }
}
