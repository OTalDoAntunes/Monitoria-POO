package MonitoriaPOO.Simulado2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{
    private List<Produto> itens = new ArrayList<Produto>();

    public void adicionar(Produto p){
        this.itens.add(p);
    }

    public void adicionar(Produto p, int quantidade) throws EstoqueInsuficienteException{
        if(quantidade > p.getEstoque())
            throw new EstoqueInsuficienteException(p.getNome(), quantidade);
        
        for(int i = 0; i < quantidade; i++){
            this.itens.add(p);
        }
    }

    public double calculartotal(){
        double total = 0;
        for(Produto p : itens){
            total += p.calcularPrecoFinal();
        }
        return total;
    }

    public double calcularFreteTotal(String cep){
        double total = 0;
        for(Produto p : itens){
            if(p instanceof Entregavel){
                total += ((Entregavel)p).calcularFrete(cep);
            }
        }
        return total;
    }
}
