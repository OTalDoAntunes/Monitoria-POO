package MonitoriaPOO.Simulado2;

public class PagamentoPix implements Pagamento{
    @Override 
    public double calcularValorFinal(double valor){
        return valor - (valor * 0.05);
    }    

    @Override 
    public String getDescricao(){
        return "pix";
    }
}
