package MonitoriaPOO.Simulado2;

public class Assinatura extends Produto{
    private int messes;

    public Assinatura(String codigo, String nome, int estoque, double precoBase, int messes){
        super(codigo, nome, estoque, precoBase);
        this.messes = messes;
    }

    @Override 
    public double calcularPrecoFinal(){
        if(messes >= 6)
            return (getPrecoBase() * messes) * 0.10;
        else
            return getPrecoBase() * messes;
    }
}
