package MonitoriaPOO.Simulado1.Questao3;

public class Livro {
    private String titulo;
    private double preco;
    private Autor autor;

    public Livro(String titulo, double preco, Autor autor){
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public double getPreco(){
        return this.preco;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + getTitulo() + "| Autor: " + autor.getNome() + "| Preço: " + getPreco() + ".");
    }
}
