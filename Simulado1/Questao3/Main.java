package MonitoriaPOO.Simulado1.Questao3;

public class Main {
    public static void main(String args[]){
        Autor autor = new Autor("Machado de Assis", "Brasileiro");
        Livro livro = new Livro("Dom Casmurro", 210, autor);
        livro.exibirDetalhes();
    }
}
