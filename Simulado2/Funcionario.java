package MonitoriaPOO.Simulado2;

public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;

    public Funcionario(String nome, String cpf, String email, int matricula){
        super(nome, cpf, email);
        this.matricula = matricula;
    }
}
