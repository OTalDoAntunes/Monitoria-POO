package MonitoriaPOO.Simulado1.Questao3;

public class Autor {
    private String nome, nacionalidade;

    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome(){
        return this.nome;
    }
}
