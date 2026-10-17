package MonitoriaPOO.Simulado2;

public abstract class Produto{
    private String nome, codigo;
    private double precoBase;
    private int estoque;

    public Produto(String codigo, String nome, int estoque, double precoBase) throws IllegalArgumentException{
        if(precoBase < 0)
            throw new IllegalArgumentException();
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
        this.precoBase = precoBase;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPrecoBase(){
        return this.precoBase;
    }

    public int getEstoque(){
        return this.estoque;
    }

    public abstract double calcularPrecoFinal();

    public String exibirResumo(){
        return this.codigo + " - " + this.nome + ": R$" + calcularPrecoFinal();
    }

    public void baixarEstoque(int quantidade){
        this.estoque -= quantidade;
    }
}
