package MonitoriaPOO.Simulado2;

public class PagamentoCartao implements Pagamento{
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite){
        this.parcelas = parcelas;
        this.limite = limite;
    }

    @Override 
    public double calcularValorFinal(double valor) throws PagamentoRecusadoException{
        if(this.parcelas > 3){
            if(valor + (valor * 0.08) > limite)
                throw new PagamentoRecusadoException("Valor ultrapassa o limite do cartão!");
            return valor + (valor * 0.08);
        }else{
            if(valor > limite)
                throw new PagamentoRecusadoException("Valor ultrapassa o limite do cartão!");
            return valor;
        }
    }

    @Override 
    public String getDescricao(){
        return "cartão";
    }
}
