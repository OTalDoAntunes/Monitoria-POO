package MonitoriaPOO.Simulado1.Questao4;

public class Main {
    public static void main(String args[]){
        GestaoPedidos pedidos = new GestaoPedidos();
        pedidos.adicionarPedido("Macarrão com queijo");
        pedidos.adicionarPedido("Sopa de cogumelos");
        pedidos.adicionarPedido("Baião com queijo e bisteca");
        System.out.println("Pedido feito: " + pedidos.proximoPedido());
        System.out.println("Pedidos a serem concluidos:");
        pedidos.listarPedidos();
    }
}
