package MonitoriaPOO.Simulado2;

public class Pessoa{
    private String nome, cpf, email;

    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String toString(){
        return "Nome: " + this.nome + " | CPF: " + this.cpf;
    }
}
