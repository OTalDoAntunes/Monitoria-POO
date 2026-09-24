package MonitoriaPOO.Simulado1.Questao4;

import java.util.ArrayList;
import java.util.List;

public class GestaoPedidos {
    private List<String> pedidos;

    public GestaoPedidos(){
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item){
        this.pedidos.add(item);
    }
    public String proximoPedido(){
        if(this.pedidos.size() < 1)
            return "Fila vazia.";
        else{
            String atual = this.pedidos.get(0);
            this.pedidos.remove(0);
            return atual;
        }
    }
    public void listarPedidos(){
        for(int i = 0; i < this.pedidos.size(); i++){
            System.out.println((i + 1) + "º pedido: " + this.pedidos.get(i));
        }
    }
}
