package MonitoriaPOO.Simulado2;

public class Main{
    public static void main(String args[]){
        try{
            Cliente cliente = new ClienteVip("Judas", "506.630.576-02", "JudasEsc@gmail.com", "Rua ES");

            Produto mouse = new ProdutoFisico("F10", "Mouse", 5, 10, 0.25);
            Produto ebook = new ProdutoDigital("B33", "O melhor ebook", 999, 500, 7);
            Produto hbo = new Assinatura("H80", "HBO", 999, 46, 5);

            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            carrinho.adicionar(mouse, 3);
            carrinho.adicionar(ebook);
            carrinho.adicionar(hbo);

            System.out.println("Pagando com pix:");
            Pedido pedido = new Pedido(cliente, carrinho);
            Pagamento pix = new PagamentoPix();
            pedido.finalizar(pix);

            System.out.println("Pagando com o cartao de limite baixo:");
            Pedido novoPedido = new Pedido(cliente, carrinho);
            Pagamento cartao = new PagamentoCartao(6, 2);
            novoPedido.finalizar(cartao);
        } catch(EstoqueInsuficienteException e){
            System.out.println("Estoque insuficiente para algum dos produtos.");
        }
    }    
}
