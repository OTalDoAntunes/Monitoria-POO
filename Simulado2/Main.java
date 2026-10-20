package MonitoriaPOO.Simulado2;

public class Main{
    public static void main(String args[]){
        try{
            Cliente cliente = new ClienteVip("Claudio", "666.777.888-00", "claudioramos@gmail.com", "Rua Z");

            Produto notebook = new ProdutoFisico("NP5", "Notebook positivo", 2, 2700.45, 4.1);
            Produto ebook = new ProdutoDigital("APQ", "Ebook: Aprenda a investir rapido", 10, 89.99, 12);
            Produto streaming = new Assinatura("PL0", "Pluto TV", 999, 27.35, 6);

            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            carrinho.adicionar(streaming);
            carrinho.adicionar(notebook, 2);
            carrinho.adicionar(ebook);

            System.out.println("===Pagamento com pix======");
            Pedido pedido = new Pedido(cliente, carrinho);
            Pagamento pix = new PagamentoPix();
            pedido.finalizar(pix);

            System.out.println("===Pagamento com cartão===");
            Pedido novoPedido = new Pedido(cliente, carrinho);
            Pagamento cartao = new PagamentoCartao(6, 7000);
            novoPedido.finalizar(cartao);

        } catch(EstoqueInsuficienteException EIE){
            System.out.println("\n");
        
        } catch(IllegalArgumentException IAE){
            System.out.println("Entrada de dado invalida!");
        
        } catch(Exception E){
            System.out.println("Um erro inesperado aconteceu.");
        
        }
    }    
}
