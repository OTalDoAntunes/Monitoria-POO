package MonitoriaPOO.Simulado2;

public class Pedido{
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho){
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void finalizar(Pagamento pagamento){
        try{
            if(this.cliente instanceof ClienteVip){
                double subtotal = carrinho.calculartotal() + carrinho.calcularFreteTotal(cliente.getCpf());
                subtotal -= (carrinho.calculartotal() + carrinho.calcularFreteTotal(cliente.getCpf())) * 0.10;

                System.out.println(pagamento.exibirComprovante(subtotal));

                cliente.adicionarPontos((int)(subtotal / 10));
            }else{
                double subtotal = carrinho.calculartotal() + carrinho.calcularFreteTotal(cliente.getCpf());
                
                System.out.println(pagamento.exibirComprovante(subtotal));

                cliente.adicionarPontos((int)(subtotal / 10));
            }
        } catch(PagamentoRecusadoException e){
            System.out.println("Pagamento recusado!");

        } finally{
            System.out.println("Pedido encerrado.");
        
        }
    }
}
